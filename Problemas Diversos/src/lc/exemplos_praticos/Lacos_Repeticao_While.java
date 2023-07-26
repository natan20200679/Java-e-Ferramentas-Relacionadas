/*
 * Dado um número inteiro "num", retorne o número de etapas para reduzi-lo a zero. Em uma etapa, se o 
 * número atual for par, você deverá dividi-lo por 2, caso contrário, deverá subtraí-lo de 1.
 */

package lc.exemplos_praticos;

import java.util.Scanner;

public class Lacos_Repeticao_While {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme um número inteiro: ");
        int num = leitor.nextInt();

        int steps = 0;
        while (num > 0) { 

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }

            steps++;
        }

        System.out.println("Etapas para redução à zero: " + steps + "\n");
        
        leitor.close();
    }
}
