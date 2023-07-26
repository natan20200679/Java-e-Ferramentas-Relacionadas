/*
 * Método que consiste na desconsideração do uso de uma matriz auxiliar.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz17_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [50, 40, 70, 60, 90]");
        
        int arr[] = {50, 40, 70, 60, 90};
        int indice[] = {3, 0, 4, 1, 2};
        
        for (int i = 0; i < indice.length; i++) {
        
            while (indice[i] != i) {               
        
                int  alvoI  = indice[indice[i]];
                char alvoE  = (char)arr[indice[i]];      
        
                arr[indice[i]] = arr[i];
                indice[indice[i]] = indice[i];               
                indice[i] = alvoI;
                arr[i] = alvoE;
        
            }
        
        }
        
        System.out.println("Matriz reordenada = " + Arrays.toString(arr));
        System.out.println("Matriz de índices modificada = " + Arrays.toString(indice) + "\n");
    
    }
    
}
