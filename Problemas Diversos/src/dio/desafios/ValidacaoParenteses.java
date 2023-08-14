/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma 
determinada string é válida. 

Entrada:

Uma string é considerada válida se caracteres de abertura devem ser fechadas pelo mesmo tipo. 
Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

Saída:

A saída corresponde a um valor Booleano
 */
package dio.desafios;

import java.util.*;

public class ValidacaoParenteses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);

    }

    public static boolean ehValido(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (s.charAt(i + 1) == ')') {

                    return true;

                }

            } else if (s.charAt(i) == '[') {

                if (s.charAt(i + 1) == ']') {

                    return true;

                }

            } else if (s.charAt(i) == '{') {

                if (s.charAt(i + 1) == '}') {

                    return true;

                }

            }

        }

        return false;

    }

}
