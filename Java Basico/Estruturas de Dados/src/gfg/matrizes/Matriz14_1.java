/*
Método que consiste no uso da idéia de "janela deslizante".
 */

package gfg.matrizes;

public class Matriz14_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [15, 2, 4, 8, 9, 5, 10, 23]\n");
        
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int soma = 23;
        int soma_corrente = arr[0], inicio = 0, i;
        
        for (i = 1; i <= arr.length; i++) {           
        
            while (soma_corrente > soma && inicio < i - 1) {
        
                soma_corrente = soma_corrente - arr[inicio];
                inicio++;
        
            }
        
            if (soma_corrente == soma) {
             
                int p = i - 1;
        
                System.out.println("Soma encontrada entre os índices " + inicio + " e " + p);
        
            }
        
            if (i < arr.length) {
        
                soma_corrente = soma_corrente + arr[i];
        
            }
        
        }
        
        System.out.println("Não há mais submatriz-soma encontrada.\n");
    
    }
    
}
