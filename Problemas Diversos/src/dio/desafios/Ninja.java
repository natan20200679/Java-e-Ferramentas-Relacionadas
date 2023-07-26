/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafios;

import java.util.Scanner;

public class Ninja {

     public static void main(String[] args) {
    	  
	    Scanner sc = new Scanner(System.in);
        int N;

        while(sc.hasNext()) {

            N = sc.nextInt();
            System.out.println((int) (Math.log10(N) / Math.log10(2)));
        }

        sc.close();

    }
}
