/*
Método que consiste em encontrar o sufixo máximo.
 */

package gfg.matrizes;

public class Matriz13_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [16, 17, 4, 3, 5, 2]");
        
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int max_direita = arr[n - 1];
        
        System.out.print("Valores Líderes desta Matriz = ");
        System.out.print(max_direita + " ");
        
        for (int i = n - 2; i >= 0; i--) {
        
            if (max_direita < arr[i]) {
        
                max_direita = arr[i];
        
                System.out.print(max_direita + " ");
        
            }
        
        }
        
        System.out.println("\n");
    
    }
    
}
