/*
Dada a matriz arr = {10, 90, 49, 2, 1, 5, 23} não classificada, de inteiros, classifique-a em uma matriz de 
onda. Uma matriz arr[0..n-1] é classificada em forma de onda se: 

arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= .....
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz8 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = {10, 90, 49, 2, 1, 5, 23}");
        
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
        
        classificacaoOnda(arr, n);
        
        System.out.println("Matriz após transformação em matriz de onda = " + Arrays.toString(arr) + 
        "\n");
    
    }

    static void troca(int arr[], int a, int b) {
    
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    
    }

    static void classificacaoOnda(int arr[], int n) {
    
        Arrays.sort(arr);
    
        for (int i = 0; i < n - 1; i += 2) {
    
            troca(arr, i, i + 1);
    
        }
    
    }
    
}