/*
Reorganizar a matriz m = {1, 3, 2, 2, 5} de tal forma que os posicionamentos pares sejam maiores que os 
ímpares.
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz4 {
    
    public static void main(String[] args) {

        System.out.println("\nMatriz = [1, 3, 2, 2, 5]");
    
        int m[] = { 1, 3, 2, 2, 5 };
        int n = m.length;
        int mr[] = new int[n];
        int p = 0, q = n - 1;
    
        Arrays.sort(m);
    
        for (int i = 0; i < m.length; i++) {
    
            if ((i + 1) % 2 == 0) {
    
                mr[i] = m[q--];
    
            } else {
    
                mr[i] = m[p++];
    
            }
    
        }
    
        System.out.println("Matriz após os pares ficarem em posições maiores do que os ímpares = " + 
        Arrays.toString(mr) + "\n");        
    
    }
    
}