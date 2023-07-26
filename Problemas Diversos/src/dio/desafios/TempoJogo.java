/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Tendo como base a hora inicial e final de um jogo, calcule a duração do dele, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de, 60 minutos e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/

package desafios;

import java.util.Scanner;

public class TempoJogo {

    public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();
		horas = fim - inicio;              

		if (horas == 0) {
		  
			System.out.print("O JOGO DUROU 24 HORA(S)\n");
			
		} else if (horas < 0) {
		  
			System.out.print("O JOGO DUROU " + ((24 - inicio) + fim) + " HORA(S)\n");
			
		} else if (horas > 0) {
		  
			System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
			
		} else {
		  
			System.out.print("O JOGO DUROU " + 1 + " HORA(S)\n");
			
		}
		
	}
}
