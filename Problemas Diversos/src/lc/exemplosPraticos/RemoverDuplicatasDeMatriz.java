/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dada uma matriz inteira numsclassificada em ordem não decrescente, remova as duplicatas no local 
de forma que cada elemento exclusivo apareça apenas uma vez. A ordem relativa dos elementos deve 
ser mantida a mesma. Em seguida, retorne o número de elementos únicos em nums .
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class RemoverDuplicatasDeMatriz {

    public static int removeDuplicates(int[] nums) {

        int i = 1;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[j - 1]) {

                nums[i] = nums[j];

                i++;

            }

        }

        return i;

    }

    public static void main(String[] args) {

        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        
        System.out.println("Número de elementos únicos = " + removeDuplicates(nums));
        System.out.println("Matriz de elementos únicos = " + Arrays.toString(nums));
    
    }
}
