/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um 
quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de 
algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não 
são. 

Entrada:

A entrada consiste em um número inteiro n, representando o valor total. 

Saída:

A saída consiste em retornar o menor número de números quadrados perfeitos.
 */
package dio.desafios;

import java.util.Scanner;

public class QuadradosPerfeitos {

    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        // int n = 20 -> Valor arbitrado
        System.out.println("The minimum number of squares is " + minQuadrados(n));

    }

    // Função de utilidade para verificar se um determinado número `n` é um quadrado perfeito ou 
    // não
    public static boolean quadradoPerfeito(int n) {

        // Encontre o valor de ponto flutuante da raiz quadrada de `n`
        double sqr = Math.sqrt(n);

        // Retorna verdadeiro se a raiz quadrada for um número inteiro
        return sqr == Math.floor(sqr);

    }

    // Função recursiva para encontrar o número mínimo de quadrados que somam `n`
    public static int minQuadrados(int n) {

        // Caso base: `n` é um quadrado perfeito
        if (quadradoPerfeito(n)) {

            return 1;

        }

        // Inicializar o resultado com o máximo de quadrados possível
        int result = n;

        // Percorrer todos os inteiros positivos menores que a raiz quadrada de `n`
        for (int i = 1; i * i < n; i++) {

            // Recorrer para `n-(i×i)` e atualizar o resultado se um valor menor for encontrado
            result = Integer.min(result, 1 + minQuadrados(n - (i * i)));

        }

        return result;

    }

}
