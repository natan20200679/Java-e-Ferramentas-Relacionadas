/*
Dada uma matriz nums de tamanho n, retorne o elemento majoritário. O elemento majoritário é o
elemento que aparece mais vezes. Você pode assumir que o elemento majoritário sempre existe na
matriz de tamanho n/2.
 */

package lc.exemplos_praticos;

import java.util.Arrays;

public class ElementoMajoritario {

    public static void main(String[] args) {

        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("\nMatriz = [2,2,1,1,1,2,2]");
        System.out.println("O Elemento Majoritário desta matriz é: " + majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];

    }

}
