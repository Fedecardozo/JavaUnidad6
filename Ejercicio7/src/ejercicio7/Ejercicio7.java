package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        int m,t;
        
        t = Inicio(); m = Inicio();
        
        multiplo(t,m);
        
    }
    
    static int Inicio(){
        
        int x;
        
        System.out.println("Ingrese numero entero: ");
        Scanner e = new Scanner(System.in);
        x = e.nextInt();
        
        
        return x;
        
    }
    
    static void multiplo(int x, int y){
        
        int []r = new int [x];
        
        System.out.println("Los multiplos de " + y + " son: " );
        
        for (int i = 0; i < x; i++) {
            
            r[i] = i * y;
            
            System.out.print(r[i] + " ");
            
        }
        
        System.out.println(" ");
        
    }
    
    
}
