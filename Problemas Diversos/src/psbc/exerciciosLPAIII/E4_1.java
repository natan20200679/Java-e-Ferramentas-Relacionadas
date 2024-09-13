/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
efetuadas por ele no mês(em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas 
vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E4_1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Vendedor: ");
        String vendedor = leitor.next();

        System.out.print("Salário Fixo: ");
        double salario_fixo = leitor.nextDouble();

        System.out.print("Total Vendas Efetuadas Mês (R$): ");
        double vendas = leitor.nextDouble();

        double comissao = 0.15;
        double salario_total = salario_fixo + (comissao * vendas);

        System.out.println("Nome: " + vendedor);
        System.out.printf("Salário Fixo: R$ %.2f %n", salario_fixo);
        System.out.printf("Salário Total: R$ %.2f %n", salario_total);
        leitor.close();
    
    }

}
