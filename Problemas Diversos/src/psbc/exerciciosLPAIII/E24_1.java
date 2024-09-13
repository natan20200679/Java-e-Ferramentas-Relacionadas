/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E24_1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um número");
            int numero = leitor.nextInt();

            if (numero == 0) {

                System.out.println("O número é zero");

            } else {

                if (numero > 0) {

                    System.out.println("O número é maior do que zero");

                } else {

                    System.out.println("O número é menor do que zero");

                }

            }

            System.out.println("Deseja continuar? S - Sim / N - Não");
            desejaContinuar = leitor.next().charAt(0);

        }

    }

}
