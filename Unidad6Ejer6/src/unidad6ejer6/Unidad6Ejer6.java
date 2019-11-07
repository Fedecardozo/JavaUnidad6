package unidad6ejer6;

import java.util.Scanner;

public class Unidad6Ejer6 {

    public static void main(String[] args) {
        
        int num; int bus;
        int[] array;
        int bandera = 0;
        
        System.out.println("Cuantos numeros desea ingresar: ");
        Scanner entrada = new Scanner(System.in);
        num = entrada.nextInt();
        array = new int[num];
        
        System.out.println("Ingrese numeros: ");
        
        for (int i = 0; i < num; i++) {
            
            array[i] = entrada.nextInt();
            
        }
        System.out.println(" ");
        System.out.println("Ingrese el numero que desea buscar: ");
        bus = entrada.nextInt();
        
        for (int j = 0; j < num; j++) {
            
            if(array[j] == bus){
                
                System.out.println("El numero: " + bus + " esta en la posicion: " + (j+1));
                
            }else{
                
                bandera++;
                
            }
            
        }
        
        if(bandera>=num){
            
            System.out.println("El numero: " + bus + " no se encontro ");
            
        }
    }
    
}
