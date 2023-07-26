/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafios;

import java.util.Scanner;

public class Theon2 {

     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int T, menor = Integer.MAX_VALUE, posMenor = 0;

        for (int i = 0; i < N; ++i) {
            T = leitor.nextInt();
            if (T < menor) {
                menor = T;
                posMenor = i+1;
            }
        }

        System.out.println(posMenor);

        leitor.close();
    }
}
