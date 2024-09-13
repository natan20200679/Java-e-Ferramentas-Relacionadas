/*
Uma frase é um palíndromo se, depois de converter todas as letras maiúsculas em minúsculas e
remover todos os caracteres não alfanuméricos, ela lê o mesmo para frente e para trás. Os
caracteres alfanuméricos incluem letras e números. Dada uma cadeia de caracteres, retorne true
se for um palíndromo, ou false se não for.
 */

package lc.exemplos_praticos;

import java.util.Scanner;

public class Palindromo2 {

    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int n = s.length();

        for (int i = 0; i < n/2; i++) {

            if (s.charAt(i) != s.charAt(n-i-1)) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("\nDigite uma frase ou palavra: ");
        String s = leitor.next();

        System.out.println(isPalindrome(s));

    }

}
