/*
 * Método que consiste na troca de elementos na matriz.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz15_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]");
        
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        
        for (int i = 0; i < arr.length;) {
        
            if (arr[i] >= 0 && arr[i] != i) {
        
                int num = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = num;
        
            } else {
        
                i++;
        
            }
        
        }
        
        System.out.println("Matriz após rearranjo = " + Arrays.toString(arr) + "\n");
    
    }
    
}
