package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        
        String num;
        
        num = inicio();
        mostrar(num);
        
    }
    static String inicio(){
        
        String m;
        
        System.out.println("Ingrese un numero de tres cifras: ");
        Scanner e = new Scanner(System.in);
        m = e.nextLine();
        
        int x = m.length();
        
        while(x<0 || x>3){
          
            System.out.println("Error, ingrese numero de tres cifras: ");
            m = e.nextLine();
            x = m.length();
            
        }
        
        return m;
        
    }
    
    static void mostrar(String m){
        
        String[] x; x = new String[3];
        int[] s; s = new int[3];
        
        for (int i = 0; i < m.length(); i++) {
            
            x[i] = m.substring(i,i+1);
            s[i] = Integer.parseInt(x[i]);
            
        }
        
        System.out.println("La suma es: " + (s[0]+s[1]+s[2]));
        
    }
    
}
