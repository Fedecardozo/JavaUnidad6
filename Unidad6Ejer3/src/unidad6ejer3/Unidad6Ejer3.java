package unidad6ejer3;

import java.util.Scanner;

public class Unidad6Ejer3 {

    public static void main(String[] args) {
        
        char[] letra;
        int num;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas letras desea ingresar: ");
        num = entrada.nextInt();
        
        letra = new char[num];
        
        
        System.out.println("Ingrese una letra: ");
        
        for (int j = 0; j < num; j++) {
            
            letra[j] = entrada.next().charAt(0);
            
        }
        
        System.out.println("De atras para adelante: ");
        
        for (int i = (num-1); i >= 0; i--) {
            
            System.out.print(letra[i] + " ");
            
        }
        
        System.out.println(" ");
        
        
    }
    
}
