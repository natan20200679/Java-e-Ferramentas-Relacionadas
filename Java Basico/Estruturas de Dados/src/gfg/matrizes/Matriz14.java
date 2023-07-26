/*
 * Dada a matriz arr[] = {15, 2, 4, 8, 9, 5, 10, 23}, de números inteiros não negativos, e uma soma 
 * inteira arbitrada, encontre uma submatriz que corresponda a esta soma. Nota: Pode haver 
 * mais de uma submatriz com a soma encontrada previamente, então imprima a primeira que ocorrer.
 */

package gfg.matrizes;

public class Matriz14 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [15, 2, 4, 8, 9, 5, 10, 23]");
        
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        
        // O fato do valor da variável "soma" ser igual ao último elemento de arr é coincidência, já que 
        // trata-se de valor arbitrado
        
        int soma = 23; 

        for (int i = 0; i < arr.length; i++) {

            int soma_corrente = arr[i];
            
            if (soma_corrente == soma) {
            
                System.out.println("Soma encontrada no índice " + i);
            
            } else {
            
                for (int j = i + 1; j < arr.length; j++) {
            
                    soma_corrente += arr[j];
            
                    if (soma_corrente == soma) {
            
                        System.out.println("\nSoma encontrada entre os índices " + i + " e " + j);
            
                    }
            
                }
            
            }
        
        }

        System.out.println("Não há mais submatriz-soma encontrada.\n");
    
    }
    
}
