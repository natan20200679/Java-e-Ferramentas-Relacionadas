/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada:

A entrada contém valores inteiros.

Saída:

A saída deve conter uma das mensagens conforme descrito acima.
 */
package dio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        
        // Continue a solucao
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (A % B == 0 || B % A == 0) {

            System.out.println("Sao Multiplos");

        } else {

            System.out.println("Nao sao Multiplos");

        }

    }

}
