package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        
        inicio();
        
    }
    
    static void inicio(){
        
        System.out.println("Ingrese palabra: ");
        Scanner e = new Scanner(System.in);
        String m = e.nextLine();
        
        System.out.println(m.toUpperCase());
        
    }

    
}