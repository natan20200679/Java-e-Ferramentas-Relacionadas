/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E13 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite um Número: ");
        int numero = leitor.nextInt();

        if (numero > 10) {

            System.out.print("O número digitado é maior do que 10!\n");
        
        }

        leitor.close();
    
    }

}
