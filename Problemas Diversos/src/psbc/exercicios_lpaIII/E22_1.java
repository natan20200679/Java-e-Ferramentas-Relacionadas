/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro,
 * prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor de venda de cada produto, a 
 * média de preço de custo e do preço de venda 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E22_1 {

    public static void main(String[] args) {

        String nomeProduto;
        float precoCusto;
        float precoVenda;
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);

        int i = 0;

        for (; i < 40; i++) {

            System.out.println("Digite o nome do produto");
            nomeProduto = leitor.nextLine();

            System.out.println("Digite o preco de custo do produto");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preco de venda do produto");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoVenda == precoCusto) {

                System.out.println("Houve um empate entre o preco de custo de custo e de venda");

            } else {

                if (precoVenda > precoCusto) {

                    System.out.println("Prejuizo");

                } else {

                    System.out.println("Lucro");
                }
            }

            System.out.println(nomeProduto + ", preco de custo - " + precoCusto + ", preco de venda - " + precoVenda);
        }

        System.out.println("A media do preco de custo e de: " + (totalCusto / i));
        System.out.println("A media do preco de venda e de: " + (totalVenda / i));
    }
}
