/*
Dada a matriz arr = {10, 21, 22, 100, 101, 200, 300}, não classificada de inteiros positivos, encontre o 
número de triângulos que podem ser formados com três elementos de matriz diferentes como três lados de 
triângulos. Para que um triângulo seja possível a partir de 3 valores, a soma de qualquer um dos dois 
valores (ou lados) deve ser maior que o terceiro valor (ou terceiro lado).
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz10 {
    
    public static void main(String[] args) {

        System.out.println("\nMatriz = [10, 21, 22, 100, 101, 200, 300]");
        
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        
        Arrays.sort(arr);
        
        int triangulos = 0;
        
        for (int i = 0; i < arr.length; i++) {
        
            for (int j = i + 1; j < arr.length; j++) {
        
                for (int k = j + 1; k < arr.length; k++) {
        
                    if (arr[i] + arr[j] > arr[k]) {
        
                        triangulos++;
        
                    }
        
                }
        
            }
        
        }
        
        System.out.println("Número de triângulos possíveis a partir desta Matriz = " + triangulos + 
        "\n");
    
    }
    
}
