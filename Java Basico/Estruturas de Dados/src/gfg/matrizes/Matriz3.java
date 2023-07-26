/*
 * Dada a matriz arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0} de números aleatórios, empurre todos os 
 * zeros de uma determinada matriz para o final da matriz
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz3 {

    public static void main(String[] args) {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        
        System.out.println("\nMatriz = [1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0]");
        
        int cont = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
        
            if (arr[i] != 0) {
        
                arr[cont++] = arr[i];

            }
        
        }
        
        while (cont < n) {
        
            arr[cont++] = 0;
        
        }
        
        System.out.println("Matriz após empurrar os zeros para trás = " + Arrays.toString(arr) + "\n");
    
    }
    
}
