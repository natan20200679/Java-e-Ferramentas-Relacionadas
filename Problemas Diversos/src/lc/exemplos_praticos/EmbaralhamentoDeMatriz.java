/*
Dada a matriz que consiste em elementos na forma nums2n[x1,x2,...,xn,y1,y2,...,yn], retornar a 
matriz no formato [x1,y1,x2,y2,...,xn,yn].

Obs.: Compilador do LeetCode acusa erro de tempo de execução. Então, considerei 
n = (nums.length / 2) na linha 17 para corrigir
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class EmbaralhamentoDeMatriz {

    public static void main(String[] args) {

        int nums[] = {2, 5, 1, 3, 4, 7};       
        int n = (nums.length) / 2;
        int ans[] = new int[2 * n];
        int j = 0;
        
        for (int i = 0; i < ans.length; i += 2) {
        
            ans[i] = nums[j++];
            ans[i + 1] = nums[n++];
        
        }
        
        System.out.println("\nMatriz = [2, 5, 1, 3, 4, 7]");
        System.out.println("Matriz após concatenação, ficando com comprimento 2n = "
                + Arrays.toString(ans) + "\n");
    
    }

}
