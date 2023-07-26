/*
 * Método que consiste em usar 0 como um elemento de pivô, e sempre que virmos um elemento diferente 
 * de zero, o trocaremos pelo elemento de pivô. Assim, todo o elemento diferente de zero virá no 
 * início.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz3_1 {
    public static void main(String[] args) {

        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        System.out.println("\nMatriz = [1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0]");

        int passo_troca = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                swap(arr, passo_troca, i);
                passo_troca++;
            
            }
        
        }
        
        System.out.println("Matriz após empurrar os zeros para trás = " + Arrays.toString(arr) + "\n");
    
    }
    public static void swap(int arr[], int a, int b) {
    
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;  
    
    }

}
