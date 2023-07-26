/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
// O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo
// abaixo:

// Tabuada de 5:
// 5 x 1 = 5
// 5 x 2 = 10
// ...
// 5 x 10 = 50

package desafios;

import java.util.Scanner;

public class Tabuada {

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada: ");
        int valor_tab = scan.nextInt();
        System.out.println("Tabuada de: " + valor_tab);

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor_tab + "X" + "=" + (valor_tab * i));
        }
        scan.close();
    }
}
