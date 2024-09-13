/* Método que consiste na classificação cíclica. */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz9_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [3, 2, 5, 6, 1, 4]");
        
        int arr[] = {3, 2, 5, 6, 1, 4};
        
        classificacao(arr);
        
        System.out.println("Matriz após ordenação dos elementos = " + Arrays.toString(arr));
    
    }

    static void classificacao(int arr[]) {
    
        int i = 0;
    
        while (i < arr.length) {
    
            int correto = arr[i] - 1;
    
            if (arr[correto] != arr[i]) {
    
                troca(arr, i, correto);
    
            } else {
    
                i++;
    
            }
    
        }
    
    }

    static void troca(int arr[], int primeiro, int segundo) {
    
        int temp = arr[primeiro];
        arr[primeiro] = arr[segundo];
        arr[segundo] = temp;
    
    }
    
}