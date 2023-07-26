/*
 * Crie um algoritmo que leia um número do usuário e informe se e o número é par ou ímpar
 */
package alba.comandos_decisao;

import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {
        System.out.print("\nDigite um número: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if (numero % 2 == 0) {
            System.out.println("\nO número digitado é par.\n");
        } else {
            System.out.println("\nO número digitado é ímpar.\n");
        }
        leitor.close();
    }
}
