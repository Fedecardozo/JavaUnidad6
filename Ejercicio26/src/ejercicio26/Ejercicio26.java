package ejercicio26;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        
        String nom;
        
        nom = inicio();
        letra(nom);
        
        
    }
    static String inicio(){
        
        System.out.println("Ingrese palabra: ");
        Scanner e = new Scanner(System.in);
        String m = e.nextLine();
        
        
        return m;
    }    
    
    static void letra(String m){
        
        char c;
        
        c = m.charAt(0);
        
        System.out.println(m.substring(1) + c);
        
    }
    
}
