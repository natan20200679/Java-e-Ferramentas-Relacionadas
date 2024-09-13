/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12] 
(0 -> 11 em linha e coluna). Em seguida, calcule e mostre a soma ou a média considerando somente 
aqueles elementos que estão na área direita da matriz (área verde em quadrados, iniciando com os 
quadrados superior e inferior não verdes, e para esquerda diminui a quantidade de verdes nesta 
proporção até sobrar 2 verdes).

Entrada:
  
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação 
(Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto 
flutuante que compõem a matriz.

Saída:
  
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 */

package desafios;

import java.io.IOException;
import java.util.Scanner;

public class AreaDireita {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 12; j++) {

                M[i][j] = leitor.nextDouble();

            }

        }

        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M.length; j++) {

                if (((i < M.length / 2) && i + j >= M.length) || ((i >= M.length / 2) && j - i > 0)) {

                    soma += M[i][j];

                }

            }

        }

        if ("O" == "M") {

            soma /= 30;

        }

        System.out.println(String.format("%.1f", soma));
        leitor.close();

    }

}
