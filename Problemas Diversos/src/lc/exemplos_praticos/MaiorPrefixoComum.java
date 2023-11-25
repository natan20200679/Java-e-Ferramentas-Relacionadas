/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Escreva uma função para encontrar a string de prefixo comum mais longa entre uma matriz de strings. Se 
não houver um prefixo comum, retorne uma string vazia "".
 */
package lc.exemplos_praticos;

import java.util.Arrays;

public class MaiorPrefixoComum {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);

        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                return res.toString();

            } else {

                res.append(s1.charAt(i));

            }

        }

        return res.toString();

    }

    public static void main(String[] args) {

        String[] strs1 = {"flower","flow","flight"};
        System.out.println("String de prefixo comum mais longa: " + '\u0022' + longestCommonPrefix(strs1) + '\u0022');

    }

}
