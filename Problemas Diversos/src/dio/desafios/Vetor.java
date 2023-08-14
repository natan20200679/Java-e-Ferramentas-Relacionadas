/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. Em cada posição 
subsequente de N (1 até 99), coloque a metade do valor armazenado na posição anterior. Imprima o 
vetor N.

Entrada:

A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída:

Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor 
armazenado naquela posição. Cada valor do vetor deve ser apresentado com 4 casas decimais.
 */
package dio.desafios;

import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Vetor {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
      
        double X = leitor.nextDouble();
        
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);

        for (int i = 1; i < 100; i++) {
        
            N[i] = N[i - 1].divide(new BigDecimal(2));
        
        }

        DecimalFormat df = new DecimalFormat("0.0000");

        for (int i = 0; i < 100; i++) {
        
            System.out.println("N[" + i + "] = " + df.format(N[i]));
        
        }
    
    }

}
