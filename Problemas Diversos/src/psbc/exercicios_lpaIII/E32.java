/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 * Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. Se forem, 
 * informar qual o tipo de triângulo que eles formam: equilátero, isósceles ou escaleno. Propriedade: o comprimento de 
 * cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
 * 
 * a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
 * b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
 * c. Triângulo equilátero é também isósceles;
 * d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E32 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int a, b, c;
        System.out.print("informe o valor a: ");
        a = leitor.nextInt();
        System.out.print("informe o valor b: ");
        b = leitor.nextInt();
        System.out.print("informe o valor c: ");
        c = leitor.nextInt();

        if (a < (b + c) || b < (a + c) || c < (a + b)) {

            System.out.print("\nOs valores podem ser lados de um triângulo\n");

            if (a == b && b == c) {

                System.out.print("O triângulo é Equilátero e Isósceles\n");

            } else if (a == b || b == c || a == c) {
                
                System.out.print("O triângulo é Isósceles\n");
                
            } else {
                
                System.out.print("O triângulo é Escaleno\n");
                
            }
            
        } else {

            System.out.print("\nOs valores não podem ser lados de um triângulo\n");

        }
    }
}
