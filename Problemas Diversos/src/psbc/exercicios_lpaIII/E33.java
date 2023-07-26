/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 * A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que calcule e exiba o salário
 * de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
 * 
 * a. Professor Nível 1 R$12,00 por hora/aula;
 * b. Professor Nível 2 R$17,00 por hora/aula;
 * c. Professor Nível 3 R$25,00 por hora/aula.
 */
package exercicios_lpaIII;

import java.util.Scanner;

public class E33 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("<----Escola APRENDER - Salários dos Professores por Nível---->");
        System.out.print("\nInforme a taxa de horas/aula: ");
        double horasTrab = leitor.nextDouble();
        System.out.print("Informe o nível empregatício: ");
        int nivel = leitor.nextInt();

        switch (nivel) {

            case 1:
                double salario1 = 12 * horasTrab;
                System.out.printf("\nSalário(Nível 1): R$ %.2f %n", salario1);
                break;
            case 2:
                double salario2 = 17 * horasTrab;
                System.out.printf("\nSalário(Nível 2): R$ %.2f %n", salario2);
                break;
            case 3:
                double salario3 = 25 * horasTrab;
                System.out.printf("\nSalário(Nível 3): R$ %.2f %n", salario3);
                break;
            default:
                throw new AssertionError();

        }
    }
}
