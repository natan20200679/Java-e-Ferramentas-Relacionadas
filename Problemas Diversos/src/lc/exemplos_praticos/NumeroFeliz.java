/*
Escreva um algoritmo para determinar se um número n é feliz. Um número feliz é um número definido pelo
seguinte processo:

- Começando com qualquer inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
- Repita o processo até que o número seja igual a 1 (onde ele ficará), ou faça um loop infinito em um ciclo
  que não inclua 1.
- Aqueles números para os quais esse processo termina em 1 são felizes.

Retorne true se n for um número feliz, e se não false.
 */

package lc.exemplos_praticos;

import java.util.Scanner;

public class NumeroFeliz {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("\nInforme um número inteiro: ");

        int n = reader.nextInt();

        System.out.println("Happy Number: " + isHappy(n));

    }

    public static boolean isHappy(int n) {

        int i = 1;

        while (i++ <= 10) {

            double somaQuad = 0;

            while (n != 0) {

                int n1 = n % 10;
                somaQuad += Math.pow(n1, 2);
                n /= 10;

            }

            if (somaQuad == 1) return true;

            n = (int) somaQuad;
        }

        return false;

    }
}
