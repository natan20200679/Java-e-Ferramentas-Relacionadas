/*
Dada uma matriz não vazia de inteiros, cada elemento aparece duas vezes, exceto um. Encontre esse
único em nums. Você deve implementar uma solução com uma complexidade de tempo de execução linear
e usar apenas espaço extra constante.
 */

package lc.exemplos_praticos;

import java.util.Arrays;

public class NumeroUnico {

    public static void main(String[] args) {

        int[] nums = {1,1,3,3,8,8,7,7,4,10,10,15,15};
        System.out.println("\nMatriz = [1,1,3,3,8,8,7,7,4,10,10,15,15]");
        System.out.println("O elemento único desta Matriz é: " + singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {

       Arrays.sort(nums);

       if (nums.length == 1) return nums[0];

       for (int i = 0; i < nums.length - 1; i += 2) {

           if (nums[i] != nums[i + 1]) return nums[i];

       }

       return nums[nums.length - 1];

    }

}

            

