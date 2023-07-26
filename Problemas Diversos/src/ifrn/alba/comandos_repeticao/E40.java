/*
 * Escreva um algoritmo que leia uma sequência de números do usuário e realize a soma desses números. 
 * Encerre a execução quando um número negativo for digitado
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E40 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        System.out.print("\nInforme um número: ");
        int num = leitor.nextInt();      
        int soma = 0;
        while (num >= 0) {
            soma += num;
            System.out.print("\nInforme um número: ");
            num = leitor.nextInt();
            if (num < 0) {
                System.out.println("\nPrograma encerrado.\n");
                break;
            }          
        }
        System.out.println("\nSoma dos números: " + soma + "\n");
        leitor.close();                  
    }
}