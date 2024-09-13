/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafios;

import java.util.Scanner;

public class Divisores {

     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        int N = leitor.nextInt();

        for (int i = 1; i <= N; i++) {
        
            if (N % i == 0) {
            
                System.out.println(i);
            
            }
        
        }

        leitor.close();
    
     }

}
