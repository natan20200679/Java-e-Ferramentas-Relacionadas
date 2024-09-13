/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no 
semestre. No final, informar o nome do aluno e a sua média (aritmética) 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Aluno: ");
        String aluno = leitor.next();

        System.out.print("Nota Prova 1: ");
        float prova1 = leitor.nextFloat();

        System.out.print("Nota Prova 2: ");
        float prova2 = leitor.nextFloat();

        System.out.print("Nota prova 3: ");
        float prova3 = leitor.nextFloat();

        float media = (prova1 + prova2 + prova3) / 3;

        System.out.println("Nome: " + aluno);
        System.out.printf("Média: %.1f", media);
        leitor.close();

    }

}
