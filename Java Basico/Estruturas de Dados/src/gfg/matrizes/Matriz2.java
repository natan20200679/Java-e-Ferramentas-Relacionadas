/*
Dada a matriz de inteiros arr = {12, 35, 1, 10, 34, 1}, nossa tarefa é escrever um programa que encontre 
eficientemente o segundo maior elemento presente na matriz. 
 */

package gfg.matrizes;

public class Matriz2 {

    public static void main(String[] args) {

        int arr[] = {12, 35, 1, 10, 34, 1};
        
        System.out.println("\nMatriz = [12, 35, 1, 10, 34, 1]");
        
        int primeiro, segundo;       
        
        primeiro = segundo = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
        
            if (arr[i] > primeiro) {
        
                segundo = primeiro;
                primeiro = arr[i];
        
            } else if (arr[i] > segundo && arr[i] != primeiro) {
        
                segundo = arr[i];
        
            }
        
        }
        
        if (segundo == Integer.MIN_VALUE) {
        
            System.out.println("Não há segundo maior elemento\n");
        
        } else {
        
            System.out.println("O segundo maior elemento é " + segundo + "\n");
        
        }
    
    }   

}