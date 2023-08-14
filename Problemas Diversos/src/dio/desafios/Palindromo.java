/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um 
palíndromo, ou seja, se a String é igual a ela mesma invertida. Dado que temos a String "digital" 
uma vez invertida temos "latigid" que são diferentes. Logo, NÃO é um Palíndromo. Já se recebemos a 
string "radar" uma vez invertida temos "radar" que são iguais.

Entrada:

A entrada consiste em um palavra.

Saída:

Para cada String informada, terá uma saída de valor Booleano: TRUE, caso a palavra seja um 
palíndromo, ou FALSE caso a palavra NÃO seja um palíndromo.
 */
package dio.desafios;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String palavra = sc.nextLine();
        String resultado = palindromo(palavra);
        
        System.out.println(resultado);

    }

    public static String palindromo(String palavra) {

        String temp = "";
        temp = new StringBuffer(palavra).reverse().toString();

        if (palavra.equals(temp)) {

            return "TRUE";

        }

        return "FALSE";

    }

}
