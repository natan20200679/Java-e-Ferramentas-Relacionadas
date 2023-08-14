/*
Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição 
Repita (Do...While)
 */
package ifrn.alba.comandos_repeticao;

public class E28 {

    public static void main(String[] args) {

        int i = 1;
        int soma = 0;

        do {

            soma += i;
            i += 1;

            System.out.println("\nSoma dos números de 1 a 15: " + soma + "\n");

        } while (i <= 15);

    }

}
