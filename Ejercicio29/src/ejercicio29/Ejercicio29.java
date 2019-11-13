package ejercicio29;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        
        String nom;
        
        nom = inicio();
        mostrar(nom);
        
        
        
    }
        static String inicio(){
        
        String m;
        
        System.out.println("Ingrese nombre y apellido: ");
        Scanner e = new Scanner(System.in);
        m = e.nextLine();
        
        return m;
        
    }
    static void mostrar(String m){
        
        String n; String r; String q;
        String c; String w;
        String[] s;
        
        n = m.substring(0,1);
        s = m.split("\\s+");
        r = s[1].substring(0,1);
        int x = s[0].length();
        c = m.substring(1,x);
        w = s[1].substring(1);
        
        q = n.toUpperCase() + c.toLowerCase()+ " " + r.toUpperCase();
        
        System.out.println( q + w.toLowerCase());
        
    }
    
}
