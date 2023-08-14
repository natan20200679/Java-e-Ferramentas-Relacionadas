/*
Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números. Utilize o 
comando de repetição Para (For)
 */
package ifrn.alba.comandos_repeticao;

import java.util.Scanner;

public class E32 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i = 0; i < 10; i++) {
        
            System.out.print("\ninforme um número: ");
            
            int num = leitor.nextInt();
            
            soma += num;
        
        }
        
        System.out.println("\nSoma dos números informados: " + soma + "\n");
        leitor.close();
    
    }

}
