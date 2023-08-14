/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade
*/

package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E18 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 0;

        while (i < 75) {

            System.out.print("\nDigite a idade da pessoa: ");
            int idade = leitor.nextInt();

            if (idade < 18) {

                System.out.println("Pessoa menor de idade.");

            } else {

                System.out.println("Pessoa maior de idade.");

            }

            i++;

        }

        leitor.close();

    }

}
