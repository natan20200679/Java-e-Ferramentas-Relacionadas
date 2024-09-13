/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma 
determinada string é válida. 

Entrada:

Uma string é considerada válida se caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura 
devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

Saída:

A saída corresponde a um valor Booleano
 */

package desafios;

import java.util.*;

public class ValidacaoParenteses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);

    }

    public static boolean ehValido(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char bracket = s.charAt(i);

            if (bracket == '(' || bracket == '[' || bracket == '{') {

                count++;

            } else if (bracket == ')' || bracket == ']' || bracket == '}') {

                count--;

                if (count < 0) {

                    return false;

                }

            }

        }

        return count == 0;

        /* Solução alternativa para este método */
        
//        Stack<Character> pilha = new Stack<>();
//
//        for (char c : s.toCharArray()) {
//            
//            if (c == '(') {
//                
//                pilha.push(')');
//            
//            } else if (c == '{') {
//            
//                pilha.push('}');
//            
//            } else if (c == '[') {
//            
//                pilha.push(']');
//            
//            } else if (pilha.isEmpty() || pilha.pop() != c) {
//            
//                return false;
//            
//            }
//            
//        }
//        
//        return pilha.isEmpty();
    }

}
