/*
 * Método que consiste no uso de classificação.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz10_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [10, 21, 22, 100, 101, 200, 300]");
        
        int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        
        Arrays.sort(arr);
        
        int triangulos = 0;
        
        for (int i = 0; i < arr.length - 2; i++) {
        
            int k = i + 2;
        
            for (int j = i + 1; j < arr.length; j++) {
        
                while (k < arr.length && arr[i] + arr[j] > arr[k]) {
        
                    ++k;
        
                }
        
                if (k > j) {
        
                    triangulos += k - j - 1;
        
                }
        
            }
        
        }
        
        System.out.println("Número de triângulos possíveis a partir desta Matriz = " + triangulos + 
        "\n");
    
    }
    
}
