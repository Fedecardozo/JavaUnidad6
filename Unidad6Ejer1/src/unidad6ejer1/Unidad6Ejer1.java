package unidad6ejer1;

import java.util.Scanner;

public class Unidad6Ejer1 {

    public static void main(String[] args) {
        
        int[] vec; vec = new int[5];
        
        System.out.println("Ingrese 5 numeros: ");
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            vec[i] = entrada.nextInt();
            
        }
        
        System.out.println("Los numeros ingresados son: ");
        
        for (int j = 0; j< 5; j++) {
            
            System.out.print(vec[j] + " " );
            
        }
        
        System.out.println(" ");
        
    }
    
}
