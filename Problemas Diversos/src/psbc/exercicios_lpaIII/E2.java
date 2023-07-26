/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois 
 * números lidos
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int a, b, soma, subtracao, multiplicacao, divisao;

        System.out.println("Digite o primeiro valor");
        a = scan.nextInt();

        System.out.println("Digite o segundo valor");
        b = scan.nextInt();

        soma = a + b;

        System.out.println("\nA soma dos valores digitados é: " + soma);

        subtracao = a - b;

        System.out.println("A subtração dos valores digitados é: " + subtracao);

        multiplicacao = a * b;

        System.out.println("A multiplicação dos valores digitados é: " + multiplicacao);

        divisao = a / b;

        System.out.println("A divisão dos valores digitados é: " + divisao);

        scan.close();

    }
}
