/*
Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a média dos 15 números. Utilize o 
comando de repetição Para (For)
 */

package alba.comandosRepeticao;

import java.util.Scanner;

public class E33 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int soma = 0;
        int media = 0;
        int num;

        for (int i = 0; i < 15; i++) {

            System.out.print("\nInforme um número: ");

            num = leitor.nextInt();
            soma += num;
            media = soma / 15;

        }

        System.out.println("\nMédia dos números: " + media + "\n");
        leitor.close();

    }

}
