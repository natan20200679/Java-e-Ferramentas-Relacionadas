/*
Escreva um algoritmo que leia um número inteiro (de 1 a 7) representando o dia da semana e informe 
o nome do dia correspondente
 */
package ifrn.alba.comandos_decisao;

import java.util.Scanner;

public class E22 {

    public static void main(String[] args) {

        System.out.print("\nInforme um número correspondente ao dia da semana: ");

        Scanner leitor = new Scanner(System.in);

        int num = leitor.nextInt();

        switch (num) {

            case 1:
                System.out.println("\nO número informado corresponde ao Domingo.\n");
                break;

            case 2:
                System.out.println("\nO número informado corresponde à Segunda-Feira.\n");
                break;

            case 3:
                System.out.println("\nO número informado corresponde à Terça-Feira.\n");

            case 4:
                System.out.println("\nO número informado corresponde à Quarta-Feira.\n");
                break;

            case 5:
                System.out.println("\nO número informado corresponde à Quinta-Feira.\n");
                break;

            case 6:
                System.out.println("\nO número informado corresponde à Sexta-Feira.\n");
                break;

            case 7:
                System.out.println("\nO número informado corresponde ao Sábado.\n");
                break;

            default:
                System.out.println("\nNúmero Inválido\n");
                break;

        }

        leitor.close();

    }

}
