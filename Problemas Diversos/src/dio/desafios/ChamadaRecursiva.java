/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N 
até 0.   

Entrada:

A Entrada: será composta por um número inteiro, N. 

Saída:

Será  impresso o somatório de N até 0
*/

package dio.desafios;

import java.util.*;

public class ChamadaRecursiva {

     public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int N = leitor.nextInt();
        int res = somatorio(N);
        
        System.out.println(res);
        leitor.close();
        
    }

    static int somatorio(int N) {
      
        if (N == 0) {
          
            return 0;
        
        } else {
        
            return N + somatorio(N - 1);
        
        }
    
    }

}
