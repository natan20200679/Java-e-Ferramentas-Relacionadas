/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E14 {

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor A: ");
        int A = leitor.nextInt();

        System.out.print("Valor B: ");
        int B = leitor.nextInt();

        if (A > B) {
            
            System.out.println("O maior valor é A!");
        }
        else {

            System.out.println("O maior valor é B!");
        }

        leitor.close();
    }
}
