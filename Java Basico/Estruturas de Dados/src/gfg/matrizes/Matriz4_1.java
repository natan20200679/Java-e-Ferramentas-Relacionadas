/*
 * Método que consiste em atravessar a matriz do primeiro elemento até n-1 e trocar o elemento pelo 
 * próximo se a condição não for satisfeita.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz4_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [1, 3, 2, 2, 5]");                
        
        int m[] = {1, 3, 2, 2, 5};
        
        for (int i = 1; i < m.length; i++) {
        
            if (i % 2 == 0) {
        
                if (m[i] > m[i - 1]) {
        
                    int temp = m[i];
                    m[i] = m[i - 1];
                    m[i - 1] = temp;
        
                }
        
            } else {
        
                if (m[i] < m[i - 1]) {
                    int temp = m[i];
                    m[i] = m[i - 1];
                    m[i - 1] = temp;
        
                }
        
            }
        
        }
        
        System.out.println("Matriz após os pares ficarem em posições maiores do que os ímpares = " + 
        Arrays.toString(m) + "\n");       
    
    }
    
}