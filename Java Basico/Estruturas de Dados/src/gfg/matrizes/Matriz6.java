/*
 * Dada uma matriz arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2, de tamanho N, a tarefa é girar a matriz por 
 * d posições para a esquerda.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz6 {

    public static void main(String[] args) {

        System.out.println("Matriz = [1, 2, 3, 4, 5, 6, 7]");
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;
        int t[] = new int[n];
        int indice = 0;
        
        for (int i = d; i < t.length; i++) {
        
            t[indice] = arr[i];
        
            indice++;
        
        }
        
        for (int i = 0; i < d; i++) {
        
            t[indice] = arr[i];
        
            indice++;
        
        }
        
        for (int i = 0; i < t.length; i++) {
        
            arr[i] = t[i];
        
        }
        
        System.out.println("Matriz após o giro de 2 posições à esquerda = " + Arrays.toString(arr) + 
        "\n");         
    
    }

}
