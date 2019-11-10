package ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {

    public static void main(String[] args) {
        
        String[] pais;
        int posi;
        
        pais = cargar();
        posi = inicio();
        System.out.println("El pais que contiene es: " + pais[posi-1]);
        
        
    }
    
    static String[] cargar(){
        
        String[] p = {"Argentina","Brasil","Paraguay","Francia","Alemania","Escocia"};
        
        
        return p;
        
    }
    static int inicio(){
        
        int x;
        
        System.out.println("Ingrese el numero de posicion del 1 al 6: ");
        Scanner e = new Scanner(System.in);
        x = e.nextInt();
        
        while(x<1 || x>6){
            
            System.out.println("Ingrese numero entre 1 y 6: ");
            x = e.nextInt();
            
        }
        
        return x;
        
    }

}
