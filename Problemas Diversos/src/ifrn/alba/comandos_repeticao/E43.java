/*
 * Escreva um algoritmo que calcule o índice de massa corporal (IMC) de várias pessoas. O IMC é 
 * calculado pela fórmula: IMC = peso / (altura * altura). Seu programa deve encerrar apenas se um 
 * valor menor ou igual a 0 for digitado para peso ou para altura
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E43 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double peso, altura;
        do {
            System.out.print("Informe o peso(massa) da pessoa em Kg: ");
            peso = leitor.nextDouble();
            if (peso <= 0) {
                System.out.println("\nPrograma Finalizado!\n");
                break;
            }
            System.out.print("Informe a altura da pessoa em m: ");
            altura = leitor.nextDouble();
            if (altura <= 0) {
                System.out.println("\nPrograma Finalizado!\n");
                break;
            }
            double imc = peso / (altura * altura);
            System.out.println("\nIMC da pessoa: " + imc);
        } while (peso > 0 && altura > 0);
        leitor.close();
    }
}