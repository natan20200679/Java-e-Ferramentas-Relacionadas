/* Método que consiste no uso de classificação. */

package gfg.matrizes;

import java.util.Arrays;

public class Matriz11_1 {

    public static void main(String[] args) {

        System.out.println("\nMatriz = [6, 10, 5, 4, 9, 120, 4, 6, 10]");
        
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        
        Arrays.sort(arr);
        
        int arr2[] = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
        
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
        
                i++;
        
            }
        
            arr2[i] = arr[i]; 
                              
        }

        /* 
        Para imprimir a matriz resultante, que terá uma amplitude menor do que a matriz base (sem 
        preenchimento automático de zeros pelo compilador por ser matriz de inteiros e estática), 
        desconsideram-se as instruções relacionadas à criação de uma nova matriz (arr2), e considera-se a 
        instrução System.out.print(arr[i] + " "), sendo o caracter entre as aspas à escolha do usuário. 
        */

        System.out.println("Matriz após eliminação dos elementos duplicados = " + 
        Arrays.toString(arr2) + "\n");   

    }

}