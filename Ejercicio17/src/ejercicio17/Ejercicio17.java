package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        
        int tam;
        int[][] mat;
        
        tam = inicio();
        mat = matriz(tam);
        mostrar(mat,tam);
        suma(mat,tam);
        
    }
    
    static int inicio(){
        
        System.out.println("Ingrese tamaño que desea de la matriz: ");
        Scanner e = new Scanner(System.in);
        int n = e.nextInt();
        
        
        return n;
        
    }
    
    static int[][] matriz(int n){
        
        int[][] x = new int[n][n];
        
        System.out.println("Ingrese numeros para llenar matriz: ");
        Scanner e = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                x[i][j] = e.nextInt();
                
            }
            
        }
        
        return x;
        
    }
    
    static void suma(int x[][], int n){
        
        int s = 0;
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < 1; j++) {
                
                s += x[i][j];
                
            }

        }
        
        System.out.println("La suma de la columna 1 es: " + s);
        
    }
    static void mostrar(int x[][], int n){
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                System.out.print(x[i][j] + " ");
                
            }
            
        }
        
        System.out.println(" ");
        
    }
    
}
