/*
 * Dado um número inteiro n, retorne uma matriz de string answer (indexada em 1) onde:
 * 
 * answer[i] == "FizzBuzz"se i é divisível por 3 e 5.
 * answer[i] == "Fizz" se i é divisível por 3.
 * answer[i] == "Buzz"se i é divisível por 5.
 * answer[i] == i (como uma string) se nenhuma das condições acima for verdadeira.
 * 
 * Exemplo:
 * 
 * Entrada: n = 3
 * Saída: ["1","2","Fizz"].
 */

package lc.exemplos_praticos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        List<String> answer = new ArrayList<String>();
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme um número: ");
        int n = leitor.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(i));
            }
        }
        System.out.println("Matriz = " + answer + "\n");
        leitor.close();
    }

}
