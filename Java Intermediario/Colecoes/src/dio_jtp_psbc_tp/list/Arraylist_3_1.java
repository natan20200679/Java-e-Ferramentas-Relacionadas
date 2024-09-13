/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Abordagem que consiste no uso de estrutura de repetição e condicional.
 */

package dio_jtp_psbc_tp.list;

import java.util.Scanner;

public class Arraylist_3_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int p1;
        int p2;
        int p3;
        int p4;
        int p5;

        while (true) {

            System.out.println("Telefonou para a vítima? (1-Sim 0-Não)");
            
            p1 = scan.nextInt();
            
            if (p1 < 0 || p1 > 1) {
            
                System.out.println("Opção Digitada Inválida");
            
                continue;
            
            }

            System.out.println("Esteve no local do crime? (1-Sim 0-Não)");
            
            p2 = scan.nextInt();
            
            if (p2 < 0 || p2 > 1) {
            
                System.out.println("Opção Digitada Inválida");
            
                continue;
            
            }

            System.out.println("Mora perto da vítima? (1-Sim 0-Não)");
            
            p3 = scan.nextInt();
            
            if (p3 < 0 || p3 > 1) {
            
                System.out.println("Opção Digitada Inválida");
            
                continue;
            
            }

            System.out.println("Devia para a vítima? (1-Sim 0-Não)");
            
            p4 = scan.nextInt();
            
            if (p4 < 0 || p4 > 1) {
            
                System.out.println("Opção Digitada Inválida");
            
                continue;
            
            }

            System.out.println("Já trabalhou com a vítima? (1-Sim 0-Não)");
            
            p5 = scan.nextInt();
            
            if (p5 < 0 || p5 > 1) {
            
                System.out.println("Opção Digitada Inválida");
            
                continue;
            
            }

            int respostas = p1 + p2 + p3 + p4 + p5;

            if (respostas == 2) System.out.println(">> Suspeita <<");

            else if (respostas >= 3 ) System.out.println(">> Cúmplice <<");

            else if (respostas == 5) System.out.println(">> Assassina <<");

            else if (respostas < 2) System.out.println(">> Inocente <<");

        }

    }

}