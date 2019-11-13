package ejercicio22;

import java.util.Scanner;


public class Ejercicio22 {

    public static void main(String[] args) {
        
        String oracion;
        
        oracion = inicio();
        mostrar(oracion);
        
        
    }
    
    static String inicio(){
        
        String m;
        
        System.out.println("Ingrese una oracion: ");
        Scanner e = new Scanner(System.in);
        m = e.nextLine();
        
        return m;
        
    }
    static void mostrar(String m){
        
        String n; String r;
        
        n = m.substring(0,1);
        r = m.substring(1);
        
        System.out.println(n.toUpperCase() + r.toLowerCase()+" ");
        
    }
    
}
