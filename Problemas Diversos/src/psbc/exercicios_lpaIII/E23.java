/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Faça um algoritmo que receba um número e mostre uma mensagem caso este número seje maior que 80, menor que 25 ou
 * igual a 40 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E23 {

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = leitor.nextInt();

        if (numero > 80) {
            
            System.out.println("\n" + numero + " -> " + "O número informado é maior do que 80");

        } else if (numero < 25) {
            
            System.out.println("\n" + numero + " -> " + "O número informado é menor do que 25");

        } else if (numero == 40) {
            
            System.out.println("\n" + numero + " -> " + "O número informado é igual à 40");

        } 

        leitor.close();
    }
}
