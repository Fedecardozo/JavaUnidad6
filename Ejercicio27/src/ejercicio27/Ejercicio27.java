package ejercicio27;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        
        String palabra;
        
        palabra = inicio();
        contador(palabra);
        
    }
    
    static String inicio(){
        
        System.out.println("Ingrese palabra: ");
        Scanner e = new Scanner(System.in);
        String m = e.nextLine();
        
        
        return m;
        
    }      
    
    static void contador(String m){
        
        String n;
        char[] r;
        int u;
        int c = 0; int z = 0;
        boolean[] x;
        
        n = m.toLowerCase();
        r = n.toCharArray();
        u = r.length;
        x = new boolean[u];
        
        
        for (int i = 0; i < u; i++) {
            
            switch(r[i]){
                
                case 'a':
                    c++;
                    break;
                case 'e':
                    c++;
                    break;
                case 'i':
                    c++;
                    break;
                case 'o':
                    c++;
                    break;
                case 'u':
                    c++;
                    break;
                default:
                    z++;
                     break;       
                
            }
            
        }
        
        System.out.println("Tiene " + c + " vocales");
        System.out.println("Tiene " + z + " consonantes");
        
    }
    
}
