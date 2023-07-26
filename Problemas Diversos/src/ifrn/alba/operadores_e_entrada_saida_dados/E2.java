/**
 * Crie um algoritmo que leia um número inteiro e mostre seu sucessor
 */

package alba.operadores_e_entrada_saida_dados;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        System.out.print("Digite um número: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        int sucessor = ++numero;
        System.out.println("Número sucessor: " + sucessor);
        leitor.close();
    }
}
