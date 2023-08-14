/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

Entrada:

A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda. 

Saída:

A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */
package dio.desafios;

import java.util.Scanner;

public class SomaMultiplos {

    public static void main(String[] args) {
        
        int A, N, soma = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for (int i = 0; i <= N; i++) {
        
            if (i % A == 0) {
            
                soma += i;
            
            }
        
        }

        System.out.println(soma);

    }

}
