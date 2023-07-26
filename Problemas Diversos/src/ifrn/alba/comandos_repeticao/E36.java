/*
 * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E36 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int i = 1;
        int quant_pares = 0;
        while (i <= 3) {
            System.out.print("\nInforme um número: ");
            double num = leitor.nextDouble();
            if (num % 2 == 0) {
                quant_pares += 1;
            }
            i += 1;
        }
        System.out.println("\nNúmeros informados que são pares: " + quant_pares + "\n");
        leitor.close();

    }
}
