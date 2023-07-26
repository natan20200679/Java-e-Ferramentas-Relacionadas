/*
 * Escreva um algoritmo que leia a quantidade de funcionários em uma empresa e, para cada funcionário 
 * leia seu nome e seu tempo de serviço (em meses). Se o funcionário possuir mais de 12 meses na 
 * empresa, escreva a mensagem “tem direito a férias”. Caso contrário, escreva a mensagem “não tem 
 * direito a férias”. Ao final, exiba quantos funcionários possuem direito a férias e quantos não 
 * possuem
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E39 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme a quantidade de funcionários: ");
        int quant_func = leitor.nextInt();
        int ferias = 0, nao_ferias = 0;
        for (int i = 0; i < quant_func; i++) {
            System.out.print("\nInforme o nome do funcionário: ");
            String nome = leitor.next();
            System.out.print("Informe o tempo(meses) de serviço do funcionário: ");
            int meses = leitor.nextInt();
            if (meses > 12) {
                System.out.println("\n" + nome + ", com tempo de serviço de " + meses + " meses, tem direito a "
                 + "férias.");
                ferias += 1;
            } else {
                System.out.println("\n" + nome + ", com tempo de serviço de " + meses + " meses, não tem " +
                "direito a férias.");
                nao_ferias += 1;
            }
        }
        System.out.println("\nTotal aptos a receber férias: " + ferias + "\n");
        System.out.println("Total não aptos a receber férias: " + nao_ferias + "\n");
        leitor.close();
    }
}
