/*
Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis. Isto é, x
deve ficar com o valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca
 */

package alba.operadores_entradaSaidaDados;

import java.util.Scanner;

public class E9 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite um valor inteiro (x): ");
        int x = leitor.nextInt();

        System.out.print("Digite um valor inteiro (y): ");
        int y = leitor.nextInt();

        System.out.println("Valores antes da troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int x1 = x;
        int y1 = y;

        x = y1;
        y = x1;

        System.out.println("Valores depois da troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("\n");
        leitor.close();

    }

}
