/*
 * Escreva um programa para imprimir todos os líderes da matriz arr[] = {16, 17, 4, 3, 5, 2}. Um 
 * elemento é um líder se for maior do que todos os elementos do lado direito. E o elemento mais à 
 * direita é sempre um líder.
 */

package gfg.matrizes;

public class Matriz13 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [16, 17, 4, 3, 5, 2]");
        
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        
        printLeaders(arr, n);
    
    }

    public static void printLeaders(int arr[], int size) {
    
        System.out.print("Valores Líderes desta Matriz = ");
    
        for (int i = 0; i < size; i++) {
    
            int j;
    
            for (j = i + 1; j < size; j++) {
    
                if (arr[i] <= arr[j]) break;
            
            }

            if (j == size) {

                System.out.print(arr[i] + " ");
            
            }
        
        }
        
        System.out.println("\n");
    
    }
    
}