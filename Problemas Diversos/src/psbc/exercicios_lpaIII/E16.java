/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a sua média 
 * (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 
 * 5.1 a 6.9) 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E16 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Aluno: ");
        String aluno = leitor.next();

        System.out.print("Nota 1: ");
        float nota1 = leitor.nextFloat();

        System.out.print("Nota 2: ");
        float nota2 = leitor.nextFloat();

        System.out.print("Nota 3: ");
        float nota3 = leitor.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.print("\nNome: " + aluno + "\n");

        if (media <= 5 && media >= 0) {
            
            System.out.printf("Média: %.1f", media);
            System.out.print("\nSituação: Reprovado\n");
            
        } else if (media >= 5.1 || media <= 6.9) {
            
            System.out.printf("Média: %.1f", media);
            System.out.print("\nSituação: Recuperação\n");

        } else if (media <= 10 && media >= 7) {
            
            System.out.printf("Média: %.1f", media);
            System.out.print("\nSituação: Aprovado\n");
        }

        leitor.close();
    }
}
