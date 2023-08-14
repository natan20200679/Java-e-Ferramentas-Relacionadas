/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Neste desafio, você terá que criar uma função que faça um número como argumento e retorne "Fizz", 
"Buzz" ou "FizzBuzz". 

Entrada:

Você receberá um número onde: 

Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
Se o número for apenas múltiplo de 3 -> "Fizz" ; 
Se o número for apenas múltiplo de 5 -> "Buzz"; 
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 

Saída:

Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, 
exiba o número.
 */

package dio.desafios;

import java.util.*;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {

            System.out.println("FizzBuzz");

        } else if (num % 3 == 0) {

            System.out.println("Fizz");

        } else if (num % 5 == 0) {

            System.out.println("Buzz");

        } else {

            System.out.println(num);

        }

    }

}
