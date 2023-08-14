/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E15 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Número: ");
        int num = leitor.nextInt();

        if (num >= 100 && num <= 200) {

            System.out.println("O número está entre 100 e 200!");
       
        }

        leitor.close();
    
    }

}
