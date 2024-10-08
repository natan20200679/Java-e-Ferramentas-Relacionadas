/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

package desafios;

import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();
        
        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
        
            for (int j = 0; j < M[i].length; j++) {
            
                M[i][j] = random.nextInt(9);
            
            }
        
        }

        System.out.println("Matriz: ");

        for (int[] linha : M) {
        
            for (int coluna : linha) {
            
                System.out.println(coluna + " ");
            
            }
            
            System.out.println();
        
        }

    }

}
