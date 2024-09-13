/*
Dada a matriz m = {1, 3, 2, 4, 7, 6, 9, 10} de inteiros, separe números pares e ímpares na matriz, de modo 
que todos os números pares devem estar presentes primeiro e, em seguida, os números ímpares.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz5 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [1, 3, 2, 4, 7, 6, 9, 10]");
        
        int m[] = {1, 3, 2, 4, 7, 6, 9, 10};
        int n = m.length;
        int mr[] = new int[n];
        int indice = 0;
        
        for (int i = 0; i < mr.length; i++) {
        
            if (m[i] % 2 == 0) {
        
                mr[indice] = m[i];
                indice++;
        
            }
        
        }
        
        for (int i = 0; i < mr.length; i++) {
        
            if (m[i] % 2 != 0) {
        
                mr[indice] = m[i];
                indice++;
        
            }
        
        }
        
        System.out.println("Matriz após os pares ficarem antes dos ímpares = " + Arrays.toString(mr) +
        "\n");       
    
    }
    
}
