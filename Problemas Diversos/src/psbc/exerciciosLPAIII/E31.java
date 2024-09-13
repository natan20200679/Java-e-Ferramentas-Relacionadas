/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para 
imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético; caso 
contrário deve ser impressa uma mensagem de operador não definido. Tratar erro de divisão por zero 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E31 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int A, B;
        int soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;
        char C;

        System.out.println("Digite o valor A: ");
        A = leitor.nextInt();

        System.out.println("Digite o valor B: ");
        B = leitor.nextInt();

        System.out.println("Digite o operador aritmético: ");
        C = leitor.next().charAt(0);

        switch (C) {

            case '+':
                soma = A + B;
                System.out.println("A + B = " + soma);
                break;

            case '-':
                subtracao = A - B;
                System.out.println("A - B = " + subtracao);
                break;

            case '*':
                multiplicacao = A * B;
                System.out.println("A + B = " + multiplicacao);
                break;

            case '/':
                if (B == 0) {
                    throw new AssertionError("Divisão por zero -> Esta divisão tende ao " + ""
                            + "infinito!");
                } else {
                    divisao = A / B;
                    System.out.println("A + B = " + divisao);
                }
                break;

            default:
                throw new AssertionError("Operador não definido!");
        
        }
    
    }

}
