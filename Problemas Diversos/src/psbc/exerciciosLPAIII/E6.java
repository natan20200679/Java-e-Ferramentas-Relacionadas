/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável 
A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. 
Apresentar os valores trocados 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor A: ");
        int A = leitor.nextInt();

        System.out.print("Valor B: ");
        int B = leitor.nextInt();

        int aux = A;

        A = B;
        B = aux;

        System.out.println("<---------------------->");
        System.out.println("Valor A Atualizado: " + A);
        System.out.println("Valor B Atualizado: " + B);
        leitor.close();
    
    }

}
