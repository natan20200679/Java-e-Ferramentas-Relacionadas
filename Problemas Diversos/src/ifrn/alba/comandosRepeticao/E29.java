/*
Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Para 
(For)
 */

package alba.comandosRepeticao;

public class E29 {

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 15; i++) {

            soma += i;

            System.out.println("\nSoma dos números de 1 a 15: " + soma + "\n");

        }

    }

}
