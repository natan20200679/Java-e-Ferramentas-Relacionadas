/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Theon deve pensar rápido e adivinhar quem é seu algoz! Entretanto, Ramsay já decidiu o que ele irá 
fazer depois que Theon der sua resposta. Theon pode dizer que seu algoz é alguma dentre N pessoas. 
Considere que as pessoas são numeradas de 1 a N. Se Theon responder que seu algoz é a pessoa i, Ramsay 
irá atingi-lo Ti vezes. Sua tarefa é ajudar Theon a determinar qual deve ser sua resposta de forma a 
minimizar o número de vezes que ele será atingido.

Entrada:

A primeira linha contém um inteiro N (1 ≤ N ≤ 100). A segunda linha contém N inteiros T1, T2, ..., 
TN (0 ≤ Ti ≤ 20).

Saída:

Imprima uma linha contendo o número da pessoa que Theon deve dizer ser seu algoz. Se existe mais de uma 
resposta possível, imprima a menor.
 */

package desafios;

import java.util.Scanner;

public class Theon {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        
        int T;
        
        int menor = 0;
        int posMenor = 0;
        
        int i;

        for (i = 1; i <= N; i++) {
        
            T = leitor.nextInt();

            if (i == 1) {
            
                posMenor = 1;
                menor = T;
            
            } else if (T < menor) {
            
                posMenor = i;
                menor = 1;
            
            }
        
        }

        System.out.println(posMenor);

    }

}
