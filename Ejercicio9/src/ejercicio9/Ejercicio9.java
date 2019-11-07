package ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        
        int[] vec;
        
        vec = inicio();
        contador(vec);
        
    }
    
    static int[] inicio(){
        
        int s;
        
        System.out.println("Cuantos numeros desea ingresar: ");
        Scanner e = new Scanner(System.in);
        s = e.nextInt();
        
        int x[] = new int[s];
        
        System.out.println("Ahora ingrese numeros: ");
        
        for (int i = 0; i < s; i++) {
            
            x[i] = e.nextInt(); 
            
        }
        
        return x;
        
    }
    
    static void contador(int x[]){
        
        int c=0; int n=0;
        
        for (int i = 0; i < x.length; i++) {
            
            if(x[i] >= 0){
                
                c++;
                
            }else if(x[i] < 0){
                
                n++;
                
            }
            
        }
        
        System.out.println("La cantidad de positivos son: " + c);
        System.out.println("La cantidad de negativos son: " + n);
        
    }
    
    
}
