/*
A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco) prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor da Compra: R$ ");
        double valor = leitor.nextDouble();

        double prestacao = valor / 5;

        System.out.printf("Valor Total da Compra: R$ %.2f \n", valor);
        System.out.printf("Valor das Prestações: R$ %.2f \n", prestacao);
        leitor.close();
    
    }

}
