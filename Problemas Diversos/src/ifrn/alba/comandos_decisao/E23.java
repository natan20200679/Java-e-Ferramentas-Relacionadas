/*
Escreva um algoritmo que leia dois números e apresente um menu com 4 opções: 

1) Somar os números; 
2) Subtrair os números; 
3) Multiplicar os números; 
4) Dividir os números. Leia a opção do usuário e execute a operação e apresente o resultado. Caso 
a opção digitada seja inválida, apresente a mensagem de “Opção inválida” para o usuário
 */
package ifrn.alba.comandos_decisao;

import java.util.Scanner;

public class E23 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme o primeiro número: ");
        int a = leitor.nextInt();

        System.out.print("\nInforme o segundo número: ");
        int b = leitor.nextInt();

        System.out.println("\nEscolha uma das opções pelo número correspondente:\n1) Somar os " + ""
                + "números\n2) Subtrair os números\n3) Multiplicar os números\n4) Dividir os " + ""
                + "números\n");
        
        int opcao = leitor.nextInt();
        
        System.out.print("Opção escolhida: " + opcao);
        
        switch (opcao) {
        
            case 1:
                int soma = a + b;
                System.out.println("Soma: " + soma);
                break;
            
            case 2:
                int subtracao = a - b;
                System.out.println("Subtração: " + subtracao);
            
            case 3:
                int multiplicacao = a * b;
                System.out.println("Multiplicação: " + multiplicacao);
            
            case 4:
            
                int divisao = a + b;
                System.out.println("Divisão: " + divisao);
            
            default:
                System.out.println("Opção inválida");
                break;
        
        }
        
        leitor.close();
    
    }

}
