/*
 * Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo, 
 * mostrando cada ano de vida da pessoa e quantos anos ela tinha em cada ano até o ano atual
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E38 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\ninforme o ano atual: ");
        int ano_atual = leitor.nextInt();
        System.out.print("Informe o ano de nascimento: ");
        int ano_nasc = leitor.nextInt(); 
        int idade = 0;       
        System.out.println("\nLinha do tempo: ");
        for (int i = ano_nasc; i <= ano_atual; i++) {
            System.out.println(i + " -> " + idade + " anos \n");  
            idade ++;                     
        }
        leitor.close();
    }
}
