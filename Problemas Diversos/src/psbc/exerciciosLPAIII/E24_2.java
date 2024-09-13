/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E24_2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme a quantidade de números: ");
        int N = leitor.nextInt();

        int i = 0;

        while (i < N) {

            System.out.print("\nInforme um número: ");
            int numero = leitor.nextInt();

            if (numero > 0) {

                System.out.println("\n" + numero + " é positivo.");
            } else if (numero < 0) {

                System.out.println("\n" + numero + " é negativo.");

            } else {

                System.out.println("\n" + numero + " é zero");

            }

            i++;

        }

        leitor.close();

    }

}
