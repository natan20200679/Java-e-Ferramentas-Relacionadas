/*
 * Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais
 */

package alba.comandos_decisao;

import java.util.Scanner;

public class E14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("\nInforme o valor de x: ");
        double x = leitor.nextDouble();
        System.out.print("\nInforme o valor de y: ");
        double y = leitor.nextDouble();
        if (x == y) {
            System.out.println("\nx e y são iguais.\n");
        } else {
            System.out.println("\nx e y não são iguais.\n");
        }
        leitor.close();
    }
}
