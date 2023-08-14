/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Paulinho tem em suas mãos um pequeno problema. A professora lhe pediu que ele construísse um 
programa para verificar, à partir de dois valores inteiros A e B, se B corresponde aos últimos 
dígitos de A.

Entrada:

A entrada consiste de vários casos de teste. A primeira linha de entrada contém um inteiro N que 
indica a quantidade de casos de teste. Cada caso de teste consiste de dois inteiros A (1 ≤ A < 231) 
e B (1 ≤ B < 231) positivos.

Saída:

Para cada caso de entrada imprima uma mensagem indicando se o segundo valor encaixa no primeiro 
valor, confome exemplo abaixo.
*/

package dio.desafios;

import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        
        int N = Integer.parseInt(scan.nextLine()); //Ou int N = scan.nextInt();

        for (int i = 0; i < N; i++) {

            String entrada = scan.nextLine();
            String[] entra = entrada.split(" ");
            String A = entra[0];
            String B = entra[1];

            if (A.equals(B)) {
        
                System.out.println("encaixa");
            
            } else {

                int tamA = A.length();
                int tamB = B.length();
                int dif = tamA - tamB;

                if (dif <= 0) {
            
                    System.out.println("nao encaixa");
                
                } else {

                    A = A.substring(dif, tamA);

                    if (A.equals(B)) {
                
                        System.out.println("encaixa");
                    
                    } else {
                    
                        System.out.println("nao encaixa");
                    
                    }

                }

            }

        }
        
        scan.close();
    
    }

}
