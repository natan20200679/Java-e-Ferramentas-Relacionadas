/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
*/

package dio.desafios;

import java.util.Scanner;

public class MaiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
        
            System.out.println("Número: ");
            
            numero = scan.nextInt();
            soma = soma + numero;

            if (numero > maior) {
            
                maior = numero;
            
            }

            count = count + 1;

        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma / 5));

    }

}
