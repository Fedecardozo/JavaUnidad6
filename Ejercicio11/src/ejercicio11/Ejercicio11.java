package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        int[] vec;
        int posi;
        
        vec = aleatorio();
        posi = inicio();
        blanco(vec, posi);
        
        
    }
    
    static int inicio(){
        
        int x;
        
        System.out.println("Ingrese posicion que desea dejar en blanco: ");
        Scanner e = new Scanner(System.in);
        x = e.nextInt();
        
        while(x<1 || x>10){
            
            System.out.println("Error, ingrese posicion del 1 al 10: ");
            x = e.nextInt();
            
        }
        
        return x;
    }
    
    static int[] aleatorio(){
        
        int[] x = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            x[i] = (int) (Math.random()*15 + 1);
            
        }
        System.out.println("Los numeros aleatorios son: ");
        
        for (int j = 0; j < 10; j++) {
            
            System.out.print(x[j] + " ");
            
        }
        
        System.out.println(" ");
        
        return x;
    }
    
    static void blanco(int x[],int y){
        
        x[y-1] = 0000;
        
        System.out.println("Ahora la posicion " + y + " esta en blanco!");
        
        System.out.println("Ahora asi quedo el vector: ");
        
        for (int i = 0; i < 10; i++) {
            
            System.out.print(x[i] + " ");
            
        }
        
        System.out.println(" ");
        
    }
    
    
}
