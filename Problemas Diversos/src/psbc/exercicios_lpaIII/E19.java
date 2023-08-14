/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E19 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int quant1 = 0;
        int quant2 = 0;

        while (i < 3) {

            System.out.print("\nInforme o Nome: ");
            leitor.next();

            System.out.print("Informe o Sexo (Informe F -> Feminino ou M -> Masculino): ");
            String sexo = leitor.next();

            switch (sexo) {

                case "F":
                    System.out.println("A pessoa informada é Mulher");
                    quant1++;
                    break;

                case "f":
                    System.out.println("A pessoa informada é Mulher");
                    quant1++;
                    break;

                case "M":
                    System.out.println("A pessoa informada é Homem");
                    quant2++;
                    break;

                case "m":
                    System.out.println("A pessoa informada é Homem");
                    quant2++;
                    break;

                default:
                    break;
            }

            i++;

        }

        System.out.println("\nTotal de Mulheres: " + quant1);
        System.out.println("Total de Homens: " + quant2);
        leitor.close();
    
    }

}
