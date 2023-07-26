/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.

package desafios;

import java.util.Scanner;

public class Consoantes {

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                quantConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.println("Consoantes: ");

        for (String consoante : consoantes) {    // Uso do For Each
            if (consoante != null) {
                System.out.println(consoante + " ");
            }
        }

        System.out.println("Quantidade de consoantes: " + quantConsoantes);
        System.out.println(consoantes.length);
        scan.close();
    }
}
