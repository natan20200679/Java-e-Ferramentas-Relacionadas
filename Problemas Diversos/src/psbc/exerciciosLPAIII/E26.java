/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um 
número que não esteja neste intervalo, exibir a seguinte mensagem: número inválido 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E26 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite um número de 1 à 5: ");
        int numero = leitor.nextInt();

        switch (numero) {

            case 1:
                System.out.println("\n" + numero + " -> Um");
                break;

            case 2:
                System.out.println("\n" + numero + " -> Dois");
                break;

            case 3:
                System.out.println("\n" + numero + " -> Três");
                break;

            case 4:
                System.out.println("\n" + numero + " -> Quatro");
                break;

            case 5:
                System.out.println("\n" + numero + " -> Cinco");
                break;

            default:
                System.out.println("\n" + numero + " -> Número inválido");

        }

        leitor.close();

    }

}
