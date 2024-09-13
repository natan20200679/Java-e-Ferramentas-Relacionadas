/*
Escreva um algoritmo que simule o funcionamento de um caixa de supermercado. O seu algoritmo deve 
receber do caixa a informação de quantos produtos o cliente comprou e, para cada produto, deverá ler o 
seu preço. Ao final, deverá informar quanto o cliente deve pagar pelas compras
 */

package alba.comandosRepeticao;

import java.util.Scanner;

public class E41 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nQuantidade de ítens: ");

        int itens = leitor.nextInt();
        double total = 0;
        int i = 0;

        while (i < itens) {

            System.out.print("\nValor do ítem(R$): ");

            double item = leitor.nextDouble();
            total += item;
            i += 1;

        }

        System.out.println("\nQuantidade de ítens: " + itens);
        System.out.printf("\nValor Total(R$): %.2f", total);
        System.out.println("\n");
        leitor.close();

    }

}
