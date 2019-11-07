package unidad6ejer2;

import java.util.Scanner;

public class Unidad6Ejer2 {

    public static void main(String[] args) {
        
        int[] vec; vec = new int[4];
        double[] div; div = new double[4];
        
        System.out.println("Ingrese 4 numeros: ");
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            
            vec[i] = entrada.nextInt();
            
        }
        
        System.out.println("Valores ingresados a la mitad: ");
        
        for (int j = 0; j < 4; j++) {
            
            div[j] = vec[j] / 2.0; 
            System.out.print(div[j] + " ");
            
        }
        
        System.out.println(" ");
        
        
    }
    
}
