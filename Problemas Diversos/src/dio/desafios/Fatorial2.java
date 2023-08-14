/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.desafios;

import java.util.Scanner;

public class Fatorial2 {

    public static void main(String[] args) {

        // Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        // Peça um número
        System.out.println("Número: ");

        // Entrada: de dados, neste caso de um int.
        int numero = scan.nextInt();

        // Variável para guardar o valor da multiplicação dos valores.
        int multiplicacao = 1;

        // Frase ilustrativo para indicar o fatorial
        System.out.print(numero + "!=");

        // Para: variável i = numero, até i maior que 0, diminuimos 1 ao valor de i a cada loop.
        for (int i = numero; i > 0; i--) {

            // Multiplicamos os valores de i e armazenamos na variável multiplicação
            multiplicacao *= i;

            // Criamos esta estrutura condicional para imprimir o resultado conforme foi solicitado 
            // no exercício. Se o i tiver o valor diferente de 1
            if (i != 1) {

                // Imprima o valor do i seguido de "."
                System.out.print(i + ".");

                // Se não (se o i tiver o valor igual a 1)
            } else {

                // Imprima o valor do i seguido do sinal "=" e o resultado da multiplicação
                System.out.print(i + "=" + (multiplicacao));

            }

        }

    }

}
