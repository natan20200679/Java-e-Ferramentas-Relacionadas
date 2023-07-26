/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 * Obs.: Esta solução abrange uma forma diferente de trabalhar com o valor da comissão do vendedor 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E4_2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Vendedor: ");
        String vendedor = leitor.next();

        System.out.print("Salário Fixo: ");
        double salario_fixo = leitor.nextDouble();

        System.out.print("Total Vendas Efetuadas Mês (R$): ");
        double vendas = leitor.nextDouble();

        double salario_total = salario_fixo + ((15d / 100d) * vendas);

        System.out.println("Nome: " + vendedor);
        System.out.printf("Salário Fixo: %.2f %n", salario_fixo);
        System.out.printf("Salário Total: %.2f %n", salario_total);

        leitor.close();
    }
}
