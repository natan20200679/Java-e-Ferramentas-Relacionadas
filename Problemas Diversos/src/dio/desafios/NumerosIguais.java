/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. 
Caso contrário, retorne "Nao sao iguais!” sem as aspas. 

Entrada:

As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números 
inteiros. 

Saída:

A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário, 
retorne "Nao sao iguais!", sem as aspas.
 */
package dio.desafios;

import java.util.*;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (A == B) {
        
            System.out.println("Sao iguais!");
        
        } else {
        
            System.out.println("Nao sao iguais!");
        
        }

    }

}
