/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Os algarismos romanos são representados por sete símbolos diferentes: I, V, X, L, C, D, M.

símbolo       Valor  
   I            1
   V            5
   X            10
   L            50
   C            100
   D            500
   M            1000

Por exemplo, 2 é escrito como II em algarismo romano, apenas dois somados juntos. 12 é escrito como  XII, 
que é simplesmente X + II. O número 27 é escrito como XXVII, que é XX + V + II. Os algarismos romanos 
geralmente são escritos do maior para o menor, da esquerda para a direita. No entanto, o numeral para 
quatro não é IIII. Em vez disso, o número quatro é escrito como IV. Como o um vem antes do cinco, nós o 
subtraímos, resultando em quatro. O mesmo princípio se aplica ao número nove, que é escrito como IX. 
Existem seis instâncias em que a subtração é usada:

- I pode ser colocado antes de V(5) e X(10) para fazer 4 e 9. 
- X pode ser colocado antes de L(50) e C(100) para fazer 40 e 90. 
- C pode ser colocado antes de D(500) e M(1000) para fazer 400 e 900.

Dado um numeral romano, converta-o para um número inteiro.
*/
package lc.exemplos_praticos;

import java.util.Scanner;

public class AlgarismosRomanos {

    public static int romanToInt(String s) {
        
        int res = 0, num = 0;
        
        for(int i = s.length() - 1; i >= 0; i--) {
            
            switch(s.charAt(i)) {
            
                case 'I': 
                    num = 1; 
                    break;
                
                case 'V': 
                    num = 5; 
                    break;
                
                case 'X': 
                    num = 10; 
                    break;
                
                case 'L': 
                    num = 50;
                    break;
                
                case 'C': 
                    num = 100; 
                    break;
                
                case 'D': 
                    num = 500; 
                    break;
                
                case 'M': 
                    num = 1000; 
                    break;
            
            }
            
            if(4 * num < res) {
                
                res -= num;
            
            } else {
            
                res += num;
            
            }
        
        }
        
        return res;
    
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um Numeral Romano: ");
        String s = leitor.next();
        System.out.println("Numeral Romano = " + s);
        System.out.println("Numeral Inteiro Correspondente = " + romanToInt(s));
    
    }

}
