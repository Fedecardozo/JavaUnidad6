package ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        
        int[] num;
        
        num = inicio();
        ordenar(num);
        
        
    }
    
    static int[] inicio(){
        
        int[] x; x = new int[5];
        
        System.out.println("Ingrese 5 numeros aletorios: ");
        Scanner e = new Scanner(System.in);
        
        for (int i = 0; i < x.length; i++) {
            
            x[i] = e.nextInt();
            
            
        }
        
        return x;
        
        
    }
    
    static void ordenar(int[] x){
        
        
        
        for (int i = 0; i < x.length-1; i++) {
            
            for (int j = 0; j < x.length-1; j++) {
                
                if(x[j] > x[j+1]){
                    
                    int a = x[j+1];
                    x[j+1] = x[j];
                    x[j] = a;
                    
                    
                } 
                
            } 
            
        }
        
        for (int i = 0; i < x.length; i++) {
            
            System.out.print(x[i] + " ");
            
        }
        
        System.out.println(" ");
        
    }
            
    
}