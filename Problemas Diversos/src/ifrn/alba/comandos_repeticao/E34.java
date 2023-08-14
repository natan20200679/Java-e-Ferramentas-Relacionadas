/*
Escreva um algoritmo que leia o nome e a idade de 10 pessoas e exiba: o nome e a idade da pessoa 
mais nova
 */
package ifrn.alba.comandos_repeticao;

import java.util.Scanner;

public class E34 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome, nome_menor;
        int idade, idade_menor;

        System.out.print("\nInforme o nome: ");
        nome = leitor.next();

        System.out.print("\nInforme a idade: ");
        idade = leitor.nextInt();

        nome_menor = nome;
        idade_menor = idade;

        for (int i = 0; i < 9; i++) {

            System.out.print("\nInforme o nome: ");
            nome = leitor.next();

            System.out.print("\nInforme a idade: ");
            idade = leitor.nextInt();
            
            if (idade < idade_menor) {
            
                nome_menor = nome;
                idade_menor = idade;
            
            }
        
        }
        
        System.out.println("\nNome e Idade da pessoa mais nova: " + nome_menor + ", "
                + idade_menor + "\n");
        leitor.close();
    
    }

}
