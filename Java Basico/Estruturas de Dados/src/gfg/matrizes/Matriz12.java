/*
 * Dada a matriz de inteiros arr = {2, 3, 5, 4, 5, 3, 4}. Todos os números ocorrem duas vezes, 
 * exceto um número que ocorre uma vez. Encontre o número.
 */

package gfg.matrizes;

public class Matriz12 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [2, 3, 5, 4, 5, 3, 4]");
        
        int arr[] = {2, 3, 5, 4, 5, 3, 4};
        int num = 0;
        
        for (int i = 0; i < arr.length; i++) {
        
            int contElem = 0;
        
            for (int j = 0; j < arr.length; j++) {
        
                if (arr[i] == arr[j]) {
        
                    contElem++;
        
                }
        
            }
        
            if (contElem == 1) {               
        
                num = arr[i];
        
            } 
        
        }
        
        System.out.println("Número cuja ocorrência é de 1 vez = " + num + "\n"); 
    
    }

}