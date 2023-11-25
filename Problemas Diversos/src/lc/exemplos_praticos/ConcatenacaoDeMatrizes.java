/*
Dado uma matriz inteira nums de comprimento n, você deseja criar uma matriz ans de comprimento 2n 
onde Ans[i] == nums[i] e Ans[i + n] == nums [i] para 0 <= i < n (indexado em 0). Especificamente, 
a ans é a concatenação de duas matrizes nums. Devolver a matriz ans.
  
Restrições:

n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class ConcatenacaoDeMatrizes {

    public static void main(String[] args) {

        int nums[] = {5, 0, 1, 2, 3, 4};
        int n = nums.length;
        int ans[] = new int[2 * n];

        for (int i = 0; i < nums.length; i++) {

            ans[i] = nums[i];
            ans[i + n] = nums[i];

        }

        System.out.println("\nMatriz = [5, 0, 1, 2, 3, 4]");
        System.out.println("Matriz após concatenação, ficando com comprimento 2n = "
                + Arrays.toString(ans) + "\n");

    }

}
