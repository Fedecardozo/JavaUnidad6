package ejercicio24;

import java.util.Scanner;


public class Ejercicio24 {

    public static void main(String[] args) {
        
        String num;
        
        num = inicio();
        mostrar(num);
        
        
    }
    static String inicio(){
        
        String m;
        
        System.out.println("Ingrese un numero entre 2 y 4 cifras: ");
        Scanner e = new Scanner(System.in);
        m = e.nextLine();
        
        int x = m.length();
        
        while(x<2 || x>4){
          
            System.out.println("Error, ingrese numero entre 2 y 4 cifras: ");
            m = e.nextLine();
            x = m.length();
            
        }
        
        return m;
        
    }
    
    static void mostrar(String m){
        
        String[] x; x = new String[4];
        int[] s; s = new int[4];
        
        for (int i = 0; i < m.length(); i++) {
            
            x[i] = m.substring(i,i+1);
            s[i] = Integer.parseInt(x[i]);
            
        }
        int u = m.length() - 1;
        
        if(s[0] == s[u]){
            
            System.out.println("Es capicua!!");
            
        }else{
            
            System.out.println("No es capicua!!");
            
        }
        
    }
    
}
