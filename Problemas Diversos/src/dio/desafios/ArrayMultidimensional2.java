/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9. Após isso determine o menor 
número da matriz e a sua posição(linha, coluna).
 */
package dio.desafios;

import java.util.Random;

public class ArrayMultidimensional2 {

    public static void main(String[] args) {

        // Classe para gerar números aleatórios
        Random random = new Random();

        // Declaração de uma matriz multidimensional
        int[][] M = new int[4][4];

        // Variáveis
        // Variável que guarda o menor valor
        int menor = Integer.MIN_VALUE;

        // Posição inicial da linha e da coluna
        int linha = 0, coluna = 0;

        // Para: variável i = 0, até i menor que o tamanho da matriz (array multidimencional), 
        // acrescentamos 1 ao valor de i a cada loop. Navegando na matriz
        for (int i = 0; i < M.length; i++) {

            // Para: variável j = 0, até i menor que o tamanho da linha, acrescentamos 1 ao valor 
            // de i a cada loop. Navegando na linha (array unidimensional)
            for (int j = 0; j < M[i].length; j++) {

                // Atribuindo um número aleatóriamente a posição do elemento
                M[i][j] = random.nextInt(9);

                // Se o elemento em uma determinada posição (linha e coluna) é menor que o menor 
                // número
                if (M[i][j] < menor) {

                    // O valor da variável menor passa a ser o valor aleatório
                    menor = M[i][j];

                    // que está na linha representada pela variável i
                    linha = i;

                    // que esta na coluna representada pela variável j
                    coluna = j;

                }

            }

        }

        // Menor valor
        System.out.println("Menor: " + menor);

        // Linha que se encontra o menor valor
        System.out.println("Linha: " + linha);

        // Coluna que se encontra o menor valor
        System.out.println("Coluna: " + coluna);

        // Mensagem ilustrativa
        System.out.println("\nMatriz");

        // Para cada linha da matriz M
        for (int[] linhaM : M) {

            // Pegue a coluna desta linhaM
            for (int colunaM : linhaM) {

                // Imprima esta coluna
                System.out.print(colunaM + " ");

            }

            // Pular uma linha
            System.out.println();

        }

    }

}
