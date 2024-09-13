/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam 
iguais imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual 
número é o maior, e uma mensagem que são diferentes 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E25 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro valor inteiro: ");
        int a = leitor.nextInt();

        System.out.print("Informe o segundo valor inteiro: ");
        int b = leitor.nextInt();

        if (a == b) {

            System.out.println("\nOs valores são iguais.");

        } else if (a > b) {

            System.out.println("\nOs valores são diferentes, e " + a + " > " + b + ".");

        } else {

            System.out.println("\nOs valores são diferentes, e " + b + " > " + a + ".");

        }

        leitor.close();

    }

}
