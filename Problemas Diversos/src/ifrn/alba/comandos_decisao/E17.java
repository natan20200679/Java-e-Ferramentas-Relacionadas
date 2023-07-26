/*
 * Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino 
 * e F para feminino). Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”, se for 
 * feminino, mostra a mensagem “Seja bem-vinda, Senhora!"
 */

package alba.comandos_decisao;

import java.util.Scanner;

public class E17 {
    public static void main(String[] args) {
        System.out.print("\nInforme o sexo da pessoa (M -> Masculino, F -> Feminino): ");
        Scanner leitor = new Scanner(System.in);
        String sexo = leitor.next();
        switch (sexo) {
            case "M":
                System.out.println("\nSeja bem-vindo, Senhor!\n");
                break;
            case "F":
                System.out.println("\nSeja bem-vinda, Senhora!\n");
                break;
            default:
                System.out.println("\nOpção inválida.\n");
                break;
        }
        leitor.close();
    }
}
