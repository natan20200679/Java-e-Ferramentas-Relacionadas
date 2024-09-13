/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares e a 
quantidade de números ímpares.
 */

package desafios;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int quantNumeros;
        int numero;
        
        int quantPares = 0;
        int quantImpares = 0;
        
        System.out.println("Quantidade de números: ");
        
        quantNumeros = scan.nextInt();
        int count = 0;

        do {
        
            System.out.println("Número: ");
            
            numero = scan.nextInt();

            if (numero % 2 == 0) {
            
                quantPares++;
            
            } else {
            
                quantImpares++;
            
            }

            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);

    }

}
