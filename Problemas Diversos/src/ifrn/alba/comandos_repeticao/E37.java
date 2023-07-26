/*
 * Escreva um algoritmo que leia um número qualquer do usuário e escreva os ímpares existentes entre 1 
 * e o número informado pelo usuário
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E37 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme um número: ");
        int num = leitor.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.print("\nNúmero ímpar entre 1 e " + num + ": " + i + "\n");
            i += 2;
        }
        leitor.close();
    }
}
