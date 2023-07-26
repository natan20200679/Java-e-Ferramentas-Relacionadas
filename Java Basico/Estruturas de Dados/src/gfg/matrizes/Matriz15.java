/*
 * Dada a matriz arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1}, de elementos de comprimento N, variando 
 * de 0 a N – 1. Todos os elementos podem não estar presentes na matriz. Se o elemento não estiver 
 * presente, haverá -1 presente na matriz. Reorganize a matriz de forma que A[i] = i e, se i não 
 * estiver presente, exiba -1 nesse local.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz15 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]");
        
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int arr2[] = new int[arr.length];
        int temp;
        
        for (int i = 0; i < arr.length; i++) {
        
            for (int j = 0; j < arr.length; j++) {
        
                if (arr[j] == i) {
        
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
        
                    break;
        
                }
        
            }
        
        }
        
        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] != i) {
        
                arr[i] = -1;
        
            }
        
        }
        
        for (int i = 0; i < arr.length; i++) {
        
            arr2[i] = arr[i];
        
        }
        
        System.out.println("Matriz após rearranjo = " + Arrays.toString(arr2) + "\n");
    
    }
    
}