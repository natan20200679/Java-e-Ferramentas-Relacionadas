/*
Dadas duas strings "p1" e "p2", retorne "true" se "p1" pode ser construído usando as letras de 
"p2" e "false" caso contrário. Cada letra em "p2" só pode ser usada uma vez em "p1". obs.: Nomes 
das variáveis foram modificados em relação ao enunciado original do elaborador.
 */
package lc.exemplos_praticos;

import java.util.Scanner;

public class Lacos_Repeticao_For {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nDigite a palavra 1: ");
        String p1 = leitor.next();

        System.out.print("Digite a palavra 2: ");
        String p2 = leitor.next();

        for (int i = 0; i < p1.length(); i++) {

            char rN = p1.charAt(i);
            int indiceComb = p2.indexOf(rN);

            if (indiceComb == -1) {

                System.out.println("\nCombinações INDISPONÍVEIS para construção da palavra 1 a " + ""
                        + "partir da palavra 2.\n");
            
            }

            p2 = p2.substring(0, indiceComb) + p2.substring(indiceComb + 1);

        }

        System.out.println("\nCombinações DISPONÍVEIS para construção da palavra 1 a partir da " + 
                "palavra 2.\n");
        leitor.close();

    }

}
