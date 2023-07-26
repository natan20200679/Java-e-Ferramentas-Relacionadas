/*
 * Dado um número de permutação baseado em zero (indexado em 0), construa uma matriz "ans" do mesmo 
 * comprimento em que ans[i] = nums[nums[i]] para cada 0 <= i < nums.Length e retorne-o. Uma 
 * permutação baseada em zero nums é uma variedade de números inteiros distintos de 0 a nums, 
 * length - 1 (inclusive).
 * 
 * Restrições:
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] < nums.length
 * The elements in nums are distinct.
 */

package lc.exemplos_praticos;

import java.util.Arrays;

public class Matriz {

    public static void main(String[] args) {
        int nums[] = {5,0,1,2,3,4};
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println("\nMatriz = " + Arrays.toString(nums));
        System.out.println("Matriz após permutação = " + Arrays.toString(ans) + "\n");
    }
    
}
