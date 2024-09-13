/* Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles */

package alba.operadores_entradaSaidaDados;

import java.util.Scanner;

public class E6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite um número (X): ");
        
        double X = leitor.nextDouble();

        System.out.print("Digite o próximo número (Y): ");
        
        double Y = leitor.nextDouble();

        double Z = X % Y;

        System.out.print("O resto da divisão X / Y é: " + Z);

        System.out.println("\n");
        leitor.close();

    }

}
