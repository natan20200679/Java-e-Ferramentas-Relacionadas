/*
 * Crie um algoritmo que leia uma frase do usuário e escreva na tela exatamente o que o usuário 
 * digitar
 */
package alba.operadores_e_entrada_saida_dados;

import java.util.Scanner;

public class E11 {
    public static void main(String[] args) {
        System.out.print("\nDigite uma frase: ");
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next() + leitor.nextLine();
        System.out.println("\nFrase digitada: " + frase);
        leitor.close();
    }
}
