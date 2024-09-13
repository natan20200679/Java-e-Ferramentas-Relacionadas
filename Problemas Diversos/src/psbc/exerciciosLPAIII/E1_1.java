/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que receba dois números e exiba o resultado da sua soma
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E1_1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a, b, soma;

        System.out.println("Digite o primeiro valor:");
        a = leitor.nextInt();

        System.out.println("Digite o segundo valor:");
        b = leitor.nextInt();

        soma = a + b;
        System.out.println("A soma dos valores digitados é: " + soma);

        leitor.close();

    }

}
