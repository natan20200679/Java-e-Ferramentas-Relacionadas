/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto 
deverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, 
gasolina – 21% ou diesel – 14%). Com valor do veículo zero encerra entrada de dados. Informe 
total de desconto e total pago pelos clientes 
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E27 {

    public static void main(String[] args) {

        System.out.println("\nBem-Vindo(a) ao CARANGO concessionária! Estamos concedendo " + ""
                + "descontos de acordo");
        System.out.println("com o tipo de combustível aceito pelo veículo. Para aproveitar, "
                + "preencha as");
        System.out.println("Informações abaixo:");

        Scanner leitor = new Scanner(System.in);

        double total_descontos = 0;
        double total_pago = 0;

        while (true) {

            System.out.print("\nValor do Veículo: R$ ");
            int valor = leitor.nextInt();

            if (valor != 0) {

                System.out.print("Tipo de Combustível do Veículo: ");
                String combustivel = leitor.next();

                double desconto_alcool = 0.25 * valor;
                double desconto_gasolina = 0.21 * valor;
                double desconto_diesel = 0.14 * valor;

                double valor_alcool = valor - desconto_alcool;
                double valor_gasolina = valor - desconto_gasolina;
                double valor_diesel = valor - desconto_diesel;

                switch (combustivel) {

                    case "alcool":
                        System.out.printf("\nValor do Desconto: R$ %.2f",
                                desconto_alcool);
                        System.out.printf("\nValor Total: R$ %.2f \n", valor_alcool);
                        total_descontos += desconto_alcool;
                        total_pago += valor_alcool;
                        break;

                    case "gasolina":
                        System.out.printf("\nValor do Desconto: R$ %.2f",
                                desconto_gasolina);
                        System.out.printf("\nValor Total: R$ %.2f \n", valor_gasolina);
                        total_descontos += desconto_gasolina;
                        total_pago += valor_gasolina;
                        break;

                    case "diesel":
                        System.out.printf("\nValor do Desconto: R$ %.2f",
                                desconto_diesel);
                        System.out.printf("\nValor Total: R$ %.2f \n", valor_diesel);
                        total_descontos += desconto_diesel;
                        total_pago += valor_diesel;
                        break;

                }

            } else {

                break;

            }

        }

        System.out.printf("\nTotal de Descontos Concedidos: R$ %.2f", total_descontos);
        System.out.printf("\nTotal Pago Pelos Clientes: R$ %.2f\n", total_pago);
        System.out.println("<------------------------>");
        leitor.close();

    }

}
