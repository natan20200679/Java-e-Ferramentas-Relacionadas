/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente
 */
package psbc.exercicios_lpaIII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E30 {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("\nInforme o primeiro valor inteiro: ");
        int valor1 = entradaDados.nextInt();

        System.out.println("Informe o segundo valor inteiro: ");
        int valor2 = entradaDados.nextInt();

        System.out.println("Informe o terceiro valor inteiro: ");
        int valor3 = entradaDados.nextInt();

        List<Integer> numeros = new ArrayList<>();

        numeros.add(valor1);
        numeros.add(valor2);
        numeros.add(valor3);

        Set<Integer> ordemCresc = new TreeSet<>(numeros);

        System.out.println("Valores Informados em ordem crescente: " + ordemCresc);
        entradaDados.close();

    }

}
