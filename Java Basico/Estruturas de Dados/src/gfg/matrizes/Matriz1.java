/*
 * Dada a matriz arr[] = {10, 4, 3, 50, 23, 90} com todos os elementos distintos, encontre os três 
 * maiores elementos.
 */

package gfg.matrizes;

public class Matriz1 {

    public static void main(String[] args) {

        int arr[] = { 10, 4, 3, 50, 23, 90 };
        
        System.out.println("\nMatriz = [10, 4, 3, 50, 23, 90]");
        
        int primeiro, segundo, terceiro;
        
        primeiro = segundo = terceiro = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] > primeiro) {
        
                terceiro = segundo;
                segundo = primeiro;
                primeiro = arr[i];
        
            } else if (arr[i] > segundo) {
        
                terceiro = segundo;
                segundo = arr[i];
        
            } else if (arr[i] > terceiro) {
        
                terceiro = arr[i];
        
            }
        
        }
        
        System.out.println("Os três maiores elementos desta matriz são: " + primeiro + ", " + segundo +
        ", " + terceiro + ".\n");
    
    }
    
}