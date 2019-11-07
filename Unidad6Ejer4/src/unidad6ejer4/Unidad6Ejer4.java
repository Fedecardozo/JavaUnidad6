package unidad6ejer4;

public class Unidad6Ejer4 {

    public static void main(String[] args) {
        
        int[] array; array = new int[10];
        int suma = 0; double promedio;
        
        for (int i = 0; i < 10; i++) {
            
            array[i] = (int) (Math.random()*15 + 1);
            
        }
        
        System.out.println("Los numeros aleatorios son: ");
        
        for (int j = 0; j < 10; j++) {
            
            System.out.print(array[j] + " ");
            
            suma += array[j];
            
        }
        
        promedio = suma/10.0;
        
        System.out.println("  ");
        
        System.out.println("El promedio es: " + promedio);
        
        
        
    }
    
}
