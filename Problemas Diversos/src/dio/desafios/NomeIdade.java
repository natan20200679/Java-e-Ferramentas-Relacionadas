/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Faça um programa que leia um conjunto de 2 valores, sendo o primeiro representando o nome do aluno
e o segundo representando a sua idade. Pare o programa inserindo o valor 0 no campo nome.
 */

package desafios;

import java.util.Scanner;

public class NomeIdade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {

            System.out.println("Nome: ");

            nome = scan.next();

            if (nome.equals("0")) {

                break;

            }

            System.out.println("Idade: ");

            idade = scan.nextInt();

        }

    }

}
