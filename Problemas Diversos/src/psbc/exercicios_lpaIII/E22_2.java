/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E22_2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int custos = 0;
        int vendas = 0;

        while (i < 2) {

            System.out.print("\nPreço de Custo: R$ ");
            int preco_custo = leitor.nextInt();

            System.out.print("Preço de Venda: R$ ");
            int preco_venda = leitor.nextInt();

            if (preco_custo < preco_venda) {

                System.out.println("\nLucro sobre produto!\n");
                System.out.println("Valor de Custo: R$ " + preco_custo);
                System.out.println("Valor de Venda: R$ " + preco_venda);

            } else if (preco_custo == preco_venda) {

                System.out.println("\nAusência de lucro sem prejuízo sobre produto!\n");

            } else {

                System.out.println("\nPrejúizo sobre produto!\n");

            }

            custos += preco_custo;
            vendas += preco_venda;
            i++;

        }

        int media_custos = custos / 2;
        int media_vendas = vendas / 2;

        System.out.println("Média do Custo: R$ " + media_custos);
        System.out.println("Média de Venda: R$ " + media_vendas);
        leitor.close();
    
    }

}
