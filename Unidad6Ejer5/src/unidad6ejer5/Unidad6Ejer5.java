package unidad6ejer5;

import java.util.Scanner;

public class Unidad6Ejer5 {

    public static void main(String[] args) {
        
        String[] nombres;
        int num;
        
        System.out.println("Cuantos nombres desea ingresar: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        
        nombres = new String[num];
        
        System.out.println("Ingrese nombres: ");
        nombres[0] = entrada.nextLine();
        
        for (int i = 0; i < num; i++) {
            
            nombres[i] = entrada.nextLine();
            
        }
        System.out.println(" ");
        System.out.println("Nombres ingresados son: ");
        
        for (int j = 0; j < num; j++) {
            
            System.out.print(nombres[j] + " ");
            
        }
        
        System.out.println(" ");
        
        
    }
    
}
