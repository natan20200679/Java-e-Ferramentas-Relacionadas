/*
 * Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E35 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num, quantMaior8 = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.print("\nInforme um número: ");
            num = leitor.nextInt();
            if (num > 8) {
                quantMaior8 += 1;
            } else {
                continue;
            }
        }
        System.out.println("\nQuantidade de números maiores do que 8: " + quantMaior8 + "\n");
        leitor.close();
    }
}
