package ejercicio14;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        int[] vec;
        
        vec = aleatorio();
        mayores(vec);
        
    }
    static int[] aleatorio(){
        
        int[] x = new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            x[i] = (int) (Math.random()*50 + 1);
            
        }
        System.out.println("Los numeros aleatorios son: ");
        
        for (int j = 0; j < 10; j++) {
            
            System.out.print(x[j] + " ");
            
        }
        
        System.out.println(" ");
        
        return x;
    }
    static void mayores(int x[]){
        
        int y = 0;
        
        for (int i = 0; i < x.length; i++) {
            
            
            if(x[i] > y){
                
                y = x[i];
                
            }
            
        }
        
        System.out.println("El mayor es el: " + y);
        
    }   
    
}
