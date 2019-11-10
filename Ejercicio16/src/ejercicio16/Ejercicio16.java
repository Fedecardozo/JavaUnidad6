package ejercicio16;

public class Ejercicio16 {

    public static void main(String[] args) {
        
        matriz();
        
    }
    
    static void matriz(){
        
        int[][] x = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                x[i][j] = (int) (Math.random()*9);
                
                System.out.print(x[i][j] + " ");
                
            }
            
        }
        System.out.println(" ");
        
    }
    
}
