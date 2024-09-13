/* Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu */

package alba.operadores_entradaSaidaDados;

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite a idade da pessoa: ");
        
        int idade = leitor.nextInt();

        int dias_vida = idade * 360;

        System.out.println("Essa pessoa já viveu até agora " + dias_vida + " dias\n");
        leitor.close();

    }

}
