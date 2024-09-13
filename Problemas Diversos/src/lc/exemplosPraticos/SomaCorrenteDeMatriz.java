/*
Dado um array nums, definimos uma soma corrente de uma matriz como 
runningSum[i] = sum(nums[0]…nums[i]). Retorne a soma corrente de nums.
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class SomaCorrenteDeMatriz {

    public static void main(String[] args) {
   
        System.out.println("\nMatriz = [1, 2, 3, 4]");
        
        int nums[] = {1, 2, 3, 4};
        int res[] = new int[nums.length];
        
        res[0] = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
        
            res[i] = nums[i] + res[i - 1];
        
        }
        
        System.out.println("Matriz soma = " + Arrays.toString(res) + "\n");
    
    }

}
