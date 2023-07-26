/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: 
 * F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E7 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Temperatura ºC: ");
        double C = leitor.nextDouble();

        double F = (((9 * C) + 160) / 5);
        
        System.out.printf("A temperatura digitada em ºF é: %.1fºF \n", F);

        leitor.close();
    }
}
