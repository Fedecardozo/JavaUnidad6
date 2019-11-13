package ejercicio25;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        
        String nom;
        
        nom = inicio();
        iniciales(nom);
        
    }
    
    static String inicio(){
        
        System.out.println("Ingrese nombre y apellido: ");
        Scanner e = new Scanner(System.in);
        String m = e.nextLine();
        
        
        return m;
    }
    
    static void iniciales(String m){
        
        char c; char u;
        String n[];
        
        c = m.charAt(0);
        n = m.split("\\s+");
        u = n[1].charAt(0);
        
        System.out.println("Las iniciales son "+ c + u);
        
    }
    
}
