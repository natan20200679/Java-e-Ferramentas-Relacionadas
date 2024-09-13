/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Crie uma classe que crie um vetor de inteiros de 10 posições. Feito isso, permita que o usuário 
digite valores inteiros a fim de preencher este vetor. Não implemente nenhum tipo controle 
referente ao tamanho do vetor, deixe que o usuário digite valores até que a entrada 0 seja 
digitada. Uma vez digitado o valor 0, o mesmo deve ser inserido no vetor e a digitação de novos 
elementos deve ser interrompida. Feita toda a coleta dos dados, exiba-os em tela. Sua classe deve
tratar as seguintes exceções:
 
ArrayIndexOutOfBoundsException -> quando o usuário informar mais que 10 valores.

InputMismatchException -> quando o usuário informar um valor que não é numerico.
 */
package excecoes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E2 {

    public static void main(String[] args) {

        int[] vetor = new int[10];
        Scanner leitor = new Scanner(System.in);

        int i = 0;

        try {

            for (int j = 0; j < 11; j++) {

                System.out.println("Digite um valor");

                int valor = leitor.nextInt();

                vetor[i] = valor;
                i++;

                if (valor == 0) {

                    break;

                }

            }

            System.out.println(Arrays.toString(vetor));

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Quantidade de valores > 10!");

        } catch (InputMismatchException e) {

            System.out.println("Valor não numérico!");

        } finally {

            System.out.println("Programa concluído!");

        }

    }

}
