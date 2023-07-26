/*
 * Crie um algoritmo que leia um número n do usuário e imprima o padrão abaixo na tela. Ex: para n = 5
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E49 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme um número: ");
        int n = leitor.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.println(" * ");
                }
            }
        }
        leitor.close();
    }
}