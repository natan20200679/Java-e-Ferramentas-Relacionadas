/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*Faça um programa que peça uma nota entre 0 e 10. Mostre uma mensagem caso o valor seja inválido e 
continue pedindo até que o usuário informe um valor válido.
*/

package desafios;

import java.util.Scanner;

public class Nota {

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }
}
