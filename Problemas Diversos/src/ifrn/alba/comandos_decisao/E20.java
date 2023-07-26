/*
 * Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o 
 * tipo do clima, de acordo com as seguintes condições: se a temperatura estiver até 18 graus, o 
 * clima é frio; se a temperatura estiver entre 19 e 23 graus, o clima é agradável; se a 
 * temperatura estiver entre 24 e 35 graus, o clima é quente; se a temperatura estiver acima de 
 * 35 graus, o clima é muito quente
 */

package alba.comandos_decisao;

import java.util.Scanner;

public class E20 {
    public static void main(String[] args) {
        System.out.print("\nInforme a temperatura(°C): ");
        Scanner leitor = new Scanner(System.in);
        double temp = leitor.nextDouble();
        if (temp <= 18) {
            System.out.println("\nClima Frio!\n");
        } else if (temp >= 19 && temp <= 23) {
            System.out.println("\nClima Agradável!\n");
        } else if (temp >= 24 && temp <= 35) {
            System.out.println("\nClima Quente!\n");
        } else {
            System.out.println("\nClima Muito Quente!\n");
        }
        leitor.close();
    }
}
