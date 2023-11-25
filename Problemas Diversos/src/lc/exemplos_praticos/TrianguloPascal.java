/*
Dado um inteiro, retorne as primeiras linhas (numRows) do triângulo de Pascal. No triângulo de Pascal, cada
número é a soma dos dois números diretamente acima dele.
 */

package lc.exemplos_praticos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TrianguloPascal {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list1 = new ArrayList<>();

        if(numRows == 0) return list1;
        if(numRows == 1) {

            List<Integer> list2 = new ArrayList<>();

            list2.add(1);
            list1.addAll(0, Collections.singleton(list2));

            return list1;

        }

        list1 = generate(numRows - 1);

        List<Integer> prevRow = list1.get(numRows - 2);
        List<Integer> currRow = new ArrayList<>();

        currRow.add(1);

        for (int i = 1; i < numRows - 1; i++) currRow.add(prevRow.get(i - 1) + prevRow.get(i));

        currRow.add(1);
        list1.add(currRow);

        return list1;

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de linhas do Triângulo: ");

        int numRows = leitor.nextInt();

        System.out.print(generate(numRows));

    }

}
