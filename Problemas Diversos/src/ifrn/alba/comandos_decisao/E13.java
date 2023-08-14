/*
Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo
 */
package ifrn.alba.comandos_decisao;

import java.util.Scanner;

public class E13 {

    public static void main(String[] args) {
        
        System.out.print("\nDigite um número: ");
        
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();
        
        if (numero < 0) {
        
            System.out.println("\nO número digitado é negativo.\n");
        
        } else if (numero == 0) {
        
            System.out.println("\nO número digitado é neutro.\n");
        
        } else {
        
            System.out.println("\nO número digitado é positivo.\n");
        
        }
        
        leitor.close();
    
    }

}
