/*
Dadas duas matrizes inteiras do mesmo tamanho, “arr = [50, 40, 70, 60, 90]” e “indice = [3,  0,  4,  1,  2]”, 
reordene os elementos em “arr”, de acordo com a matriz de índice fornecida. Não é permitido o comprimento do 
array "arr".
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz17 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [50, 40, 70, 60, 90]");
        
        int arr[] = {50, 40, 70, 60, 90};
        int indice[] = {3, 0, 4, 1, 2};
        int temp[] = new int[arr.length];
        
        for (int i = 0; i < temp.length; i++) {
        
            temp[indice[i]] = arr[i];
        
        }
        
        for (int i = 0; i < temp.length; i++) {
        
            arr[i] = temp[i];
            indice[i] = i;
        
        }
        
        System.out.println("Matriz reordenada = " + Arrays.toString(arr));
        System.out.println("Matriz de índices modificada = " + Arrays.toString(indice) + "\n");
    
    }
    
}
