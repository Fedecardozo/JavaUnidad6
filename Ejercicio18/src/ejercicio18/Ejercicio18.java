package ejercicio18;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        boolean[][] asientos;
        
        asientos = matriz();
        mostrar(asientos);
        disponible(asientos);
        
    }
    
    static boolean[][] matriz(){
        
        boolean[][] r = new boolean[4][4];
        int[][] s = new int[4][4];
        
        for (int z = 0; z < 4; z++) {
            
            for (int e = 0; e < 4; e++) {
               
                s[z][e] = (int) (Math.random()*10+1);
                
                if(s[z][e] > 5){
                    
                    r[z][e] = false;
                    
                }else if(s[z][e] < 5){
                    
                    r[z][e] = true;
                    
                }
                
            }
  
        }
        
        /*for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {

                x[i][j] = r[i][j];
                
            }
            
        }*/
        
        
        return r;
        
    }
    
    static void mostrar(boolean x[][]){
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                System.out.print(x[i][j] + " ");
                
            }
            
        }
        
        System.out.println(" ");
        
    }
    
    static void disponible(boolean x[][]){
        
        int c=0;
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                if(x[i][j] == true){
                    
                    c++;
                    
                }
                
            }
        }
        
        System.out.println("Hay disponibles " + c + " butacas");
        
    }
    
}
