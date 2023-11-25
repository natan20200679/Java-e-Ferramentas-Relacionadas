/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dado um inteiro x, retorne true se x for um palíndromo e false caso contrário. Nota: O tipo de
retorno pelo enunciado seria "boolean", porém foi modificado para "String".
 */
package lc.exemplos_praticos;

import java.util.Scanner;

public class Palindromo {

    public static String isPalindrome(int x) {

        String s = String.valueOf(x);
        int n = s.length();

        for (int i = 0; i < n/2; i++) {

            if (s.charAt(i) != s.charAt(n-i-1)) {

                return "não é Palíndromo";

            }

        }

        return "é palíndromo";

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int x = leitor.nextInt();
        
        System.out.println("O número " + x + isPalindrome(x));
        
    }
    
}
