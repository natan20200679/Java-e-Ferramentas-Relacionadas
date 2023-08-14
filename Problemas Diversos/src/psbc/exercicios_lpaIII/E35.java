/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da 
conta de luz segue a tabela abaixo:
 
Tipo de Cliente Valor do KW/h:

a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29.
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E35 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o consumo do cliente(Kw): ");
        double consumo = leitor.nextDouble();

        System.out.print("Informe o tipo do cliente: ");
        String cliente = leitor.next();

        if (cliente.equals("residencia") || cliente.equals("Residencia")) {

            double valorTotal = consumo * 0.60;

            System.out.printf("Valor Total: R$ %.2f %n", valorTotal);

        } else if (cliente.equals("Comercio") || cliente.equals("comercio")) {

            double valorTotal2 = consumo * 0.48;

            System.out.printf("Valor Total: R$ %.2f %n", valorTotal2);

        } else if (cliente.equals("Industria") || cliente.equals("industria")) {

            double valorTotal3 = consumo * 1.29;

            System.out.printf("Valor Total: R$ %.2f %n", valorTotal3);

        } else {

            throw new AssertionError("Tipo do cliente informado não existe!");

        }

    }

}
