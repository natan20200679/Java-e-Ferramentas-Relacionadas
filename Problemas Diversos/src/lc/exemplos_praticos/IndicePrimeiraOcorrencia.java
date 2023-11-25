/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dadas duas strings needle e haystack, retorne o índice da primeira ocorrência de needle em haystack ou -1 se
needle não faz parte de haystack.
 */
package lc.exemplos_praticos;

import java.util.Scanner;

public class IndicePrimeiraOcorrencia {

    public static int strStr(String haystack, String needle) {

        int lenH = haystack.length();
        int lenN = needle.length();
        
        if (lenH >= lenN) {
        
            for (int i = 0; i <= lenH - lenN; i++) {
            
                if (haystack.charAt(i) == needle.charAt(0)) {
                
                    boolean found = true;
                    
                    for (int j = 1; j < lenN; j++) {
                    
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                        
                            found = false;
                            
                            break;
                        
                        }
                    
                    }
                    
                    if (found) {
                    
                        return i;
                    
                    }
                
                }
            
            }
        
        }
        
        return -1;
    
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a palavra haystack: ");
        String haystack = leitor.next();
        System.out.print("Informe a palavra needle: ");
        String needle = leitor.next();
        
        System.out.println(strStr(haystack, needle));
        
    }
}
