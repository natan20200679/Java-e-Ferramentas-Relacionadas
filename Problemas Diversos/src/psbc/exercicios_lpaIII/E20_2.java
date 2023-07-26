/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E20_2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int quant1 = 0;
        int quant3 = 0;

        while (true) {

            System.out.print("\nValor Padrão: R$ ");
            double valor = leitor.nextDouble();

            System.out.print("Ano: ");
            int ano = leitor.nextInt();

            double desconto1 = 0.12 * valor;
            double valor1 = valor - desconto1;

            double desconto2 = 0.07 * valor;
            double valor2 = valor - desconto2;

            if (ano <= 2000) {

                System.out.printf("\nValor do Desconto: R$ %.2f \n", desconto1);
                System.out.printf("Valor Total: R$ %.2f \n", valor1);
                quant1++;
                quant3++;

            } else if (ano > 2000) {

                System.out.printf("\nValor do Desconto: R$ %.2f\n", desconto2);
                System.out.printf("Valor Total: R$ %.2f \n", valor2);
                quant3++;

            }

            System.out.print("\nDeseja continuar? Sim (s) ou Não (n) -> ");
            String execucao = leitor.next();

            switch (execucao) {

                case "s":
                    continue;

                case "n":
                    System.out.println("\nTotal Veículos Até 2000: " + quant1);
                    System.out.println("Total Veículos: " + quant3);

            }

            leitor.close();
            
        }
    }
}