/*
 * Você tem a matriz arr = {3, 2, 5, 6, 1, 4}, que contém 1 ao n-ésimo elemento. Sua tarefa é 
 * classificar essa matriz de forma eficiente e sem substituir por 1 a n números.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz9 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [3, 2, 5, 6, 1, 4]");
        
        int arr[] = { 3, 2, 5, 6, 1, 4 };
        
        Arrays.sort(arr);
        
        System.out.println("Matriz após ordenação dos elementos = " + Arrays.toString(arr));
    
    }
    
}