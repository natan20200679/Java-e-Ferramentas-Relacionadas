/**
 * Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a 
 * cotação é US$ 1 = R$ 1,82
 */
package alba.operadores_e_entrada_saida_dados;

import java.util.Scanner;

public class E8 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor (U$): ");
        double valor_dolar = leitor.nextDouble();
        double cotacao = 1.82;
        double valor_reais = valor_dolar * cotacao;
        System.out.println("O valor (R$) é: " + valor_reais);
        System.out.println("\n");
        leitor.close();
    }
}
