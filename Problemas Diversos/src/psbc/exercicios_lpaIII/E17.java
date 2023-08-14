/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 
150 (inclusive) 
 */
package psbc.exercicios_lpaIII;

import java.util.Scanner;

public class E17 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int i = 0;
        int quant = 0;

        while (i < 80) {

            System.out.print("Digite um Número: ");
            int numero = leitor.nextInt();

            if (numero >= 10 && numero <= 150) {

                quant++;

            }

            i++;

        }

        System.out.println("Quantidade de números na faixa [10, 150]: " + quant);
        leitor.close();
    
    }

}
