package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
       
        int[] vecA = new int[5];
        int[] vecB = new int[5];
        int[] vecC = new int[5];
        
        vecA = inicio();
        vecB = inicio();
        
        tresVec(vecA,vecB,vecC);
        
    }
    
    static int[] inicio(){
        
        int[] x = new int[5];
        
        System.out.println("Ingrese 5 numeros: ");
        Scanner e = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            x[i] = e.nextInt();
            
        }
        
        return x;
        
    }
    
    static void tresVec(int y[], int r[], int x[]){
        
        for (int i = 0; i < 5; i++) {
            
            x[i] = y[i] + r[i];
            
            System.out.print(x[i] + " ");
            
            
        }
        
        System.out.println(" ");
        
    }
    
}
