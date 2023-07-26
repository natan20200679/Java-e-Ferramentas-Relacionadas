/*
 * Método que consiste na utilização de 2 ponteiros.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz10_2 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [10, 21, 22, 100, 101, 200, 300]");
        
        int arr[] = {10, 21, 22, 100, 101, 200, 300};
        
        Arrays.sort(arr);
        
        int triangulos = 0;
        
        for (int i = arr.length - 1; i >= 1; i--) {
        
            int l = 0, r = i - 1;
        
            while (l < r) {
        
                if (arr[l] + arr[r] > arr[i]) {
        
                    triangulos += r - l;
                    r--;
        
                } else {
        
                    l++;
        
                }
        
            }
        
        }
        
        System.out.println("Número de triângulos possíveis a partir desta Matriz = " + triangulos + 
        "\n");
    
    }
    
}
