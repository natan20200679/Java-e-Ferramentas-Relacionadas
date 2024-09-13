/*
Dada a matriz arr = {1, 3, 5, 7, 9} de tamanho n e vários valores em torno dos quais precisamos girar a 
matriz à esquerda. Como imprimir rapidamente várias rotações à esquerda?
 */

package gfg.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz7 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("\nMatriz = [1, 3, 5, 7, 9]");
        
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;
        int t[] = new int[n];
        int indice = 0;
        
        System.out.print("Informe um valor posicional (pivô): ");
        
        int pos = leitor.nextInt();       
        
        for (int i = pos; i < t.length; i++) {
        
            t[indice] = arr[i];
            indice++;
        
        }
        
        for (int i = 0; i < pos; i++) {
        
            t[indice] = arr[i];
            indice++;    
            
        }
        
        for (int i = 0; i < t.length; i++) {
        
            arr[i] = t[i];
        
        }
        
        System.out.println("Matriz após o giro, em torno dos seus elementos, a partir de uma posição "
        + "arbitrada, à esquerda = " + Arrays.toString(arr));
        leitor.close();
        
    }
    
}

