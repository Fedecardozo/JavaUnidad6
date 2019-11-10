package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        
        int tam; int mul; int[] vec;
        String msj = "Ingrese tamaño para el array: ";
        String msj2 = "Ingrese numero: ";
        
        
        tam = inicio(msj);
        mul = inicio(msj2);
        vec = relleno(tam,mul);
        mostrar(vec,tam,mul);
        
    }
    
    static int inicio(String l){
        
        int x;
        
        System.out.println(l);
        Scanner e = new Scanner(System.in);
        x = e.nextInt();
        
        while(x<1){
            
            System.out.println("Error, ingrese numero mayor a 0!");
            x = e.nextInt(); 
            
        }
        
        return x;
    }
    
    static int[] relleno(int x, int y){
        
        int[] v = new int[x];
        
        for (int i = 0; i < x; i++) {
            
            v[i] = (i + 1) * y;
            
        }
        
        return v;
    }
    
    static void mostrar(int x[], int y, int s){
        
        System.out.println("Los multiplos de " + s + " son: ");
        
        for (int i = 0; i < y; i++) {
            
            System.out.print(x[i] + " ");
            
        }
        
        System.out.println(" ");
        
    }
    
}
