/*
 * Método que consiste na troca dos elementos presentes na matriz arr até que a matriz auxiliar
 * "indice_arr" não seja igual a variável de iteração "i".
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz17_2 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [50, 40, 70, 60, 90]");
        
        int arr[] = { 50, 40, 70, 60, 90 };
        int indice[] = { 3, 0, 4, 1, 2 };
        int n = arr.length;
        int arr2[] = new int[n];
        int indice2[] = new int[n];
        
        reordem(arr, indice, n);
        
        for (int i = 0; i < n; i++) {
        
            arr2[i] = arr[i];
        
        }
        
        System.out.println("Matriz reordenada = " + Arrays.toString(arr2));
        
        for (int i = 0; i < n; i++) {
        
            indice2[i] = indice[i];
        
        }
        
        System.out.println("Matriz de índices modificada = " + Arrays.toString(indice2) + "\n");
    
    }

    public static void troca(int arr[], int a, int b) {
    
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    
    }

    public static void reordem(int arr[], int indice_arr[], int n) {
    
        for (int i = 0; i < n; i++) {
    
            while (indice_arr[i] != i) {
    
                troca(arr, i, indice_arr[i]);
                troca(indice_arr, i, indice_arr[i]);
    
            }
    
        }
    
    }
    
}
