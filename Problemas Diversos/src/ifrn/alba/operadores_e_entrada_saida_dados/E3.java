/*
Crie um algoritmo que leia um número inteiro e mostre seu antecessor
 */
package ifrn.alba.operadores_e_entrada_saida_dados;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {
 
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = leitor.nextInt();
        
        int antecessor = --numero;
        
        System.out.println("Número antecessor: " + antecessor);
        leitor.close();
    
    }

}
