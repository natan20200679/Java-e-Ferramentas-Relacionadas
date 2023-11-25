/*
Dada uma matriz nums e um inteiro k, retorne se houver dois índices distintos i e j na matriz tal que
nums[i] == nums[j] e abs(i - j) <= k.
 */

package lc.exemplos_praticos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ContemDuplicata2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int nums[] = {1,2,3,1};

        System.out.println("\nMatriz = [1,2,3,1]");
        System.out.print("Informe um valor inteiro: ");

        int k = reader.nextInt();

        System.out.println("Contains Duplicate: " + containsNearbyDuplicate(nums, k));

        reader.close();

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] == nums[j] && Math.abs(i - j) <= k) return true;

            }
        }

        return false;

//        Solução que elimina o Tempo Limite de Execução Excedido (IDE do Leetcode):

//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++) {
//            if(map.containsKey(nums[i])) {
//                if(Math.abs(i - map.get(nums[i])) <= k) return true;
//            }
//            map.put(nums[i], i);
//        }
//        return false;

    }

}
