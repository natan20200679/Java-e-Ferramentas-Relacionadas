/* Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor */

package alba.comandosDecisao;

import java.util.Scanner;

public class E15 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme o valor de x: ");
        double x = leitor.nextDouble();

        System.out.print("\nInforme o valor de y: ");
        double y = leitor.nextDouble();

        if (x > y) {

            System.out.println("\n" + x + " é o valor maior.\n");

        } else if (x == y) {

            System.out.println("\n" + x + " e " + y + " são iguais.\n");

        } else {

            System.out.println("\n" + y + " é o valor maior.\n");

        }

        leitor.close();

    }

}
