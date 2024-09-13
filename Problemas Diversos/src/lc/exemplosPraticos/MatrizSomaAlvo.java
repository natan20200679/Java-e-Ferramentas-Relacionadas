/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dada uma matriz de inteiros nums e um inteiro target, retorne os índices dos dois números de modo que eles 
somem o alvo. Você pode supor que cada entrada teria exatamente uma solução e não pode usar o mesmo 
elemento duas vezes. Você pode retornar a resposta em qualquer ordem.
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class MatrizSomaAlvo {

    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        
        for (int i = 0; i <= n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }

            }

        }

        return new int[]{};

    }

    public static void main(String[] args) {
        
        int nums[] = {2, 7, 11, 15};
                
        System.out.println("Matriz dos Índices: " + Arrays.toString(twoSum(nums, 9)));

    }

}
