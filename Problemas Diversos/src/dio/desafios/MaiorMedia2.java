/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
package dio.desafios;

import java.util.Scanner;

public class MaiorMedia2 {

    public static void main(String[] args) {

        // Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        // Variáveis 
        // Guarda o maior número
        double maior = 0;

        // Guarda a soma
        double soma = 0;

        // Guarda a média
        double media;

        // Controla o loop
        int count = 0;

        // Loop
        do {
            
            // Peça um número
            System.out.println("Número: ");

            // Entrada: de dados, neste caso de um Double.
            double numero = scan.nextDouble();

            // Caso o valor que o usuário digitou seja maior que o valor armazanado na variável 
            // maior.
            if (numero > maior) {

                // Atribua o valor deste número a variável maior.
                maior = numero;
            
            }

            // Some o número informado pelo usuário com variável soma (independente do valor)
            soma = soma + numero;

            // Some o valor 1 ao contador, até que invalide a condição do loop. (count < 5)
            count = count + 1;

        // Enquanto o contador tiver o valor menor que 5
        } while (count < 5);

        // Faça o cálculo da média. (soma/quantidade)
        media = soma / 5;

        // Imprimindo o maior número digtados e a média dos mesmos
        System.out.println("Maior: " + maior + " - Média: " + media);
    
    }

}
