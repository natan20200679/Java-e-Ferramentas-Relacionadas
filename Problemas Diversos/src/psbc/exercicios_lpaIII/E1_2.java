/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Obs.: Esta solução utiliza função (método), e a utlização de um tipo de variável diferente, bem como uma forma
 * diferente de inserir esse tipo usado, apenas para ilustração de aplicabilidade 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E1_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double a = scan.nextDouble();

        System.out.println("Digite o segundo valor");
        double b = scan.nextDouble();

        double soma = soma(a, b);
        System.out.println("A soma dos valores digitados é: " + soma);

        scan.close();

    }

    private static double soma(double a, double b) {

        return a + b;
    }
}
