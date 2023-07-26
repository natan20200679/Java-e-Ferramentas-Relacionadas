/*
 * Crie um algoritmo, utilizando laços de repetição aninhados, que exiba na tela a tabuada de 
 * multiplicação dos números de 1 a 9
 */

package alba.comandos_repeticao;

import java.util.Scanner;

public class E46 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\ninforme o valor referente à tabuada: ");
        int valor = leitor.nextInt();
        System.out.println("\n<------Tabuada de " + valor + "------>");
        for (int i = 1; i <= 9; i++) {
            int mult = valor * i;
            System.out.println(valor + " x " + i + " = " + mult);
        }
        System.out.println("");
        leitor.close();
    }
}
