/*
Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele
 */
package ifrn.alba.operadores_e_entrada_saida_dados;

import java.util.Scanner;

public class E10 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("\nDigite o primeiro nome do usuário: ");       
        String nome = leitor.next();
        
        System.out.println("\nSeja bem-vindo, " + nome + "!\n");
        leitor.close();
    
    }

}
