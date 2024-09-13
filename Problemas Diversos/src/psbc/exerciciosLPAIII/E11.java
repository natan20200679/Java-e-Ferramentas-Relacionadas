/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que 
o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Preço de Custo: R$ ");
        double custo = leitor.nextDouble();

        System.out.print("Lucro: % ");
        int lucro = leitor.nextInt();

        double valor_venda = custo + ((lucro / 100d) * custo);

        System.out.printf("Valor da Venda: R$ %.2f \n", valor_venda);
        leitor.close();
    
    }

}
