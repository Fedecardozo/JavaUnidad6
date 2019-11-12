package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        String[] palabras;
        
        palabras = inicio();
        mostrar(palabras);
        
    }
    
    static String[] inicio(){
        
        String[] m; m = new String[3];
        
        
        System.out.println("Ingrese 3 palabras: ");
        Scanner e = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            
            m[i] = e.nextLine();
            
        }
        
        
        return m;
        
    }
    
    static void mostrar(String[] m){
        
        for (int i = 2; i >=0 ; i--) {
            
            System.out.print(m[i] + " ");
            
        }
        
        System.out.println(" ");
        
    }
    
}

