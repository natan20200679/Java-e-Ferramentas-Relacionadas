/*
Dado um inteiro, retorne a linha (0-indexada) do triângulo de Pascal.
 */

package lc.exemplos_praticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrianguloPascal2 {
    public static List<Integer> getRow(int rowIndex) {

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 1;i <= rowIndex + 1;i ++) {

            List<Integer> list2 = new ArrayList<>();

            for(int j = 0;j < i;j ++) {

                if(j == 0 || j == i - 1) list2.add(1);
                else list2.add(list.get(i-2).get(j-1)+list.get(i-2).get(j));

            }

            list.add(list2);

            if(i == rowIndex + 1) return list2;

        }

        return new ArrayList<>();

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número do índice da linha do Triângulo: ");

        int rowIndex = leitor.nextInt();

        System.out.print(getRow(rowIndex));

    }

}
