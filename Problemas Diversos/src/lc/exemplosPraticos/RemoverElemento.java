/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dado um array inteiro nums e um inteiro val, remova todas as ocorrências de val em nums. A ordem dos 
elementos pode ser alterada. Em seguida, retorne o número de elementos em nums que não são iguais a val. 
Considere que o número de elementos em nums que não são iguais a val é k. Você precisa fazer o seguinte:
Altere a matriz nums de forma que os primeiros k elementos nums contenham os elementos que não são iguais a 
val. Os elementos restantes de nums não são importantes, assim como o tamanho de nums. Retornar k.
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class RemoverElemento {

    public static int removeElement(int[] nums, int val) {

        int pos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {

                nums[pos] = nums[i];
                pos++;
                
            }

        }

        return pos;

    }

    public static String matrizRes(int[] nums, int val) {
        
        int nums2[] = new int[nums.length];        
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {

                nums[pos] = nums[i];
                nums2[i] = nums[pos];
                pos++;
                
            }

        }

        return Arrays.toString(nums2);
    }
    
    public static void main(String[] args) {

        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        System.out.println("Matriz original = " + Arrays.toString(nums));
        System.out.println("k = " + removeElement(nums, val));
        System.out.println("Matriz após remoção dos elementos iguais a " + val + " = " + matrizRes(nums, val));

    }

}
