/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que receba o número do mês e mostre o mês correspondente. Valide mês inválido 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E29 {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.print("\nInforme o número do mês: ");
        int numMes = entradaDados.nextInt();

        switch (numMes) {

            case 1:
                System.out.println(numMes + " -> Corresponde à Janeiro");
                break;

            case 2:
                System.out.println(numMes + " -> Corresponde à Fevereiro");
                break;

            case 3:
                System.out.println(numMes + " -> Corresponde à Março");
                break;

            case 4:
                System.out.println(numMes + " -> Corresponde à Abril");
                break;

            case 5:
                System.out.println(numMes + " -> Corresponde à Maio");
                break;

            case 6:
                System.out.println(numMes + " -> Corresponde à Junho");
                break;

            case 7:
                System.out.println(numMes + " -> Corresponde à Julho");
                break;

            case 8:
                System.out.println(numMes + " -> Corresponde à Agosto");
                break;

            case 9:
                System.out.println(numMes + " -> Corresponde à Setembro");
                break;

            case 10:
                System.out.println(numMes + " -> Corresponde à Outubro");
                break;

            case 11:
                System.out.println(numMes + " -> Corresponde à Novembro");
                break;

            case 12:
                System.out.println(numMes + " -> Corresponde à Dezembro");
                break;

            default:
                System.out.println("Mês Inválido!");
                break;
        
        }

        entradaDados.close();
    
    }

}
