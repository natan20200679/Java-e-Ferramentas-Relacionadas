/*
 * Método abaixo consiste no giro dos elementos um por um.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz6_1 {

    public static void main(String[] args) {
        
        System.out.println("Matriz = [1, 2, 3, 4, 5, 6, 7]");
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        int p = 1;
        
        while (p <= d) {
        
            int ultimo = arr[0];
        
            for (int i = 0; i < n - 1; i++) {
        
                arr[i] = arr[i + 1];               
        
            }
        
            arr[n - 1] = ultimo;
        
            p++;
        
        }
        
        System.out.println("Matriz após o giro de 2 = o giro de 2 o giro de 2 " + Arrays.toString(arr)
        + "\n");   
    
    }
    
}
