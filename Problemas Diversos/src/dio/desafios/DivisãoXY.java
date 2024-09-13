/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do 
primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em 
questão.

Entrada:

A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) 
que serão lidos em seguida.

Saída:

Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao 
impossivel” caso não seja possível efetuar o cálculo.
*/

package desafios;

import java.io.IOException;
import java.util.Scanner;

public class DivisãoXY {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);    
        int N = leitor.nextInt();

        for (int i = 0; i < N; i++) {
        
            int X = leitor.nextInt();
            int Y = leitor.nextInt();
            
            if (Y == 0) {
            
                System.out.println("divisao impossivel");
            
            } else {
            
                System.out.printf("%.1f\n", (float) X / Y);
            
            }
        
        }
        
        leitor.close();
    
    }

}
