/*
 * Crie um algoritmo que leia dois valores (x e y) representando um intervalo. Em seguida, leia 
 * um novo valor (z) e verifique se z pertence ao intervalo [x, y]
 */

package alba.comandos_decisao;

import java.util.Scanner;

public class E18 {
    public static void main(String[] args) {
        System.out.print("\nDigite o valor de x: ");
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        System.out.print("\nDigite o valor de y: ");
        int y = leitor.nextInt();
        System.out.print("\nDigite o valor de z: ");
        int z = leitor.nextInt();
        if (z >= x && z <= y) {
            System.out.println("\n" + z + " pertence ao intervalo [" + x + ", " + y + "]\n");
        } else {
            System.out.println("\n" + z + " não pertence ao intervalo [" + x + ", " + y + "]\n");
        }
        leitor.close();
    }
}
