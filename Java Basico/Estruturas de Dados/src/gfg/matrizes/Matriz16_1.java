/*
 * Método que consiste no uso dos dois ponteiros "i" e "j".
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz16_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [-1, 2, -3, 4, 5, 6, -7, 8, 9]");
        
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int n = arr.length;
        
        rearranjo(arr, n);
        mostrarMatriz(arr, n);
    
    }

    public static void rearranjo(int arr[], int n) {
    
        int i = -1, j = n;
    
        while (true) {
    
            while (i < n - 1 && arr[++i] >= 0) {
    
            }
    
            while (j > 0 && arr[--j] < 0) {
    
            }          
    
            if (i >= j) {
    
                return;
    
            }
    
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    
        }
    
    }

    public static void mostrarMatriz(int arr[], int n) {
    
        int arr2[] = new int[n];
    
        for (int i = 0; i < n; i++) {
    
            arr2[i] = arr[i];
    
        }
    
        System.out.print("Matriz após rearranjo = " + Arrays.toString(arr2));
        System.out.println("\n");
    
    }
    
}
