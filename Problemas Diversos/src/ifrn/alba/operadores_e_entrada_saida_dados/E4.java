/*
Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da multiplicação de x 
por y. Obs.: A inclusão do tratamento de exceção Try Catch neste exercício é opcional
 */
package ifrn.alba.operadores_e_entrada_saida_dados;

import java.util.Scanner;

public class E4 {

    public static void main(String[] args) {

        try {

            Scanner leitor = new Scanner(System.in);

            System.out.print("Digite um número inteiro X: ");
            int X = leitor.nextInt();

            System.out.print("Digite outro número inteiro Y: ");
            int Y = leitor.nextInt();

            int Z = X * Y;

            System.out.println("X x Y = " + Z);
            leitor.close();

        } catch (Exception e) {

            System.out.println("O(s) valor(es) digitado(s) não é(são) inteiro(s)");

        }

    }

}
