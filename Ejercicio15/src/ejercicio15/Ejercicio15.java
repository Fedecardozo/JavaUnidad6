package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        
        String[] vec;
        String nombre;
        
        vec = clientes();
        nombre = inicio();
        busqueda(vec,nombre);
        
    }
    static String[] clientes(){
        
        String[] m = {"Enzo","Lionel","Ariel","Lucio","Alan"};
        
        return m;
        
    }
    static String inicio(){
        
        String m;
        
        System.out.println("Ingrese nombre de cliente que desea buscar: ");
        Scanner e = new Scanner(System.in);
        m = e.nextLine();
        
        return m;
        
    }
    static void busqueda(String m[], String l){
        
        boolean b = false;
        int u = 0;
        
        for (int i = 0; i < 5; i++) {
            
            b = l.equalsIgnoreCase(m[i]);
            //b = m[i].equals(l);
            
            if(b == true){
                
                u = i + 1;
                
            }
            
        }
        
        if(u != 0){
            
            System.out.println("Nombre existe!. Esta en la posicion: " + u);
            
        }else if(u == 0){
            
            System.out.println("El nombre no existe ");
            
        }
        
    }
    
}
