/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5! = 120.
*/ 

package desafios;

import java.util.Scanner;

public class Fatorial {

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        
        int fatorial = scan.nextInt();
        int multiplicacao = 1;
        
        System.out.println(fatorial + "! = ");

        for (int i = fatorial; i >= 1; i--) {
        
            multiplicacao = multiplicacao * 1;
        
        }

        System.out.println(multiplicacao);

    }

}
