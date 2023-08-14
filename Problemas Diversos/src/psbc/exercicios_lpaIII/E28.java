/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios:

a.50% para aqueles que ganham menos do que três salários mínimos;
b.20% para aqueles que ganham entre três até dez salários mínimos;
c.15% para aqueles que ganham acima de dez até vinte salários mínimos;
d.10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à 
empresa vai aumentar sua folha de pagamento 
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E28 {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("\nInforme o nome do funcionário: ");
        String nome = entradaDados.next();

        System.out.print("Informe o salário do funcionário: R$ ");
        int salario = entradaDados.nextInt();

        System.out.print("Informe o salário mínimo: R$ ");
        int salarioMin = entradaDados.nextInt();

        if (salario < (3 * salarioMin)) {

            double salarioMenor3Min = salario + (0.50 * salario);

            System.out.println("\nFuncionário: " + nome);
            System.out.println("Reajuste: 50 %");
            System.out.printf("Salário Reajustado: R$ %.2f", salarioMenor3Min);

        } else if (salario >= (3 * salarioMin) || salario <= (10 * salarioMin)) {

            double salarioEntre3e10 = salario + (0.20 * salario);

            System.out.println("\nFuncionário: " + nome);
            System.out.println("Reajuste: 20 %");
            System.out.printf("Salário Reajustado: R$ %.2f", salarioEntre3e10);

        } else if (salario > (10 * salarioMin) || salario <= (20 * salarioMin)) {

            double salarioEntre10e20 = salario + (0.15 * salario);

            System.out.println("\nFuncionário: " + nome);
            System.out.println("Reajuste: 15 %");
            System.out.printf("Salário Reajustado: R$ %.2f", salarioEntre10e20);

        } else {

            double salarioRestante = salario + (0.10 * salario);

            System.out.println("\nFuncionário: " + nome);
            System.out.println("Reajuste: 10 %");
            System.out.printf("Salário Reajustado: R$ %.2f", salarioRestante);

        }

        double totalFolhaPag = ((0.50 * salario) + (0.20 * salario) + (0.15 * salario) + 
                (0.10 * salario) * 584);

        System.out.printf("\nAcréscimo Folha de Pagamento: R$ %.2f", totalFolhaPag);
        System.out.println("\n<----------------------->");
        entradaDados.close();

    }

}
