package ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        
        String frase;
        
        frase = inicio();
        contador(frase);
        
    }
    static String inicio(){
        
        System.out.println("Ingrese una frase: ");
        Scanner e = new Scanner(System.in);
        String m = e.nextLine();
        
        
        return m;
        
    }   
    static void contador(String m){
        
        
        String n[];
        int x;
        
        
        n = m.split("\\s+");
        x = n.length;
        
        System.out.println("Las palabras son: " + x);
        
    }
    
    
}
