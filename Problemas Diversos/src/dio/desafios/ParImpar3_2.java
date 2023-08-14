/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.desafios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParImpar3_2 {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);// Já faz o parse do tipo

        int numero = 0; // Inteiro não negativo
        
        List<Integer> impares = new ArrayList<Integer>();
        List<Integer> pares = new ArrayList<Integer>();

        int linhas = leitor.nextInt(); // Linhas a serem lidas

        for (int i = 0; i < linhas; i++) {

            numero = leitor.nextInt();

            if (numero % 2 == 0) {

                pares.add(numero);

            } else {

                impares.add(numero);
            
            }
        
        }

        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);

        for (int par : pares) {

            System.out.println(par);

        }

        for (int impar : impares) {

            System.out.println(impar);

        }
    
    }

}
