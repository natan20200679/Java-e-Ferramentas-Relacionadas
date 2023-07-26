/*
 * Método que consiste na utilização do método "sort()" da classe "Arrays".
 */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz1_1 {

    public static void main(String[] args) {

        int arr[] = { 10, 4, 3, 50, 23, 90 };

        System.out.println("\nMatriz = [10, 4, 3, 50, 23, 90]");

        Arrays.sort(arr);

        int tam = arr.length;
        
        System.out.println("Os três maiores elementos desta matriz são: ");
        System.out.println("Primeiro: " + arr[tam - 1]);
        System.out.println("Segundo: " + arr[tam - 2]);
        System.out.println("Terceiro: " + arr[tam - 3] + "\n");
    
    }

}
