/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 * Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo 
 * o juro da poupança em 0,07% a.m 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E9 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor Depositado: R$ ");
        double valorDep = leitor.nextDouble();

        double valorFin = valorDep + (0.07d / 100d) * valorDep;
        System.out.printf("Valor Total Após Aplicação (1 mês): R$ %.2f \n", valorFin);

        leitor.close();

    }
}
