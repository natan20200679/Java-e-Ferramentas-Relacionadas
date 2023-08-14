/*
Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o 
comando de repetição Enquanto (While)
 */
package ifrn.alba.comandos_repeticao;

import java.util.Scanner;

public class E30 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int soma = 0;

        while (i < 10) {

            System.out.print("\nInforme um número: ");

            int num = leitor.nextInt();

            soma += num;
            i += 1;

        }

        System.out.println("\nSoma dos números informados: " + soma + "\n");
        leitor.close();

    }

}
