/*
 * Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5
 */

package alba.comandos_decisao;

import java.util.Scanner;

public class E19 {
    public static void main(String[] args) {
        System.out.print("\nDigite um número: ");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        if (numero % 5 == 0) {
            System.out.println("\nO número digitado é múltiplo de 5.\n");
        } else {
            System.out.println("\nO número digitado não é múltiplo de 5.\n");
        }
        leitor.close();
    }
}
