/*
A matriz arr = [-1, 2, -3, 4, 5, 6, -7, 8, 9] contém números positivos e negativos em ordem aleatória. 
Reorganize os elementos da matriz para que os números positivos e negativos sejam colocados alternativamente. 
Nota: O processo de partição altera a ordem relativa dos elementos. A ordem de aparecimento dos elementos 
não é mantida com essa abordagem.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz16 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [-1, 2, -3, 4, 5, 6, -7, 8, 9]");
        
        int arr[] = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int arr2[] = new int[arr.length];
        int i = -1, temp = 0;
        
        for (int j = 0; j < arr.length; j++) {
        
            if (arr[j] < 0) {
        
                i++;
        
                temp = arr[i];        
                arr[i] = arr[j];
                arr[j] = temp;
        
            }
        
        }
        
        int pos = i + 1, neg = 0;
        
        while (pos < arr.length && neg < pos && arr[neg] < 0) {
        
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;        
            pos++;
            neg += 2;
        
        }
        
        for (i = 0; i < arr.length; i++) {
        
            arr2[i] = arr[i];
        
        }
        
        System.out.println("Matriz após rearranjo = " + Arrays.toString(arr2) + "\n");
    
    }

}
