/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os 
inteiros ímpares. Retorne um array que satisfaça essa condição.

Entrada:

A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array. As linhas 
seguintes deverão conter os valores que esse array receberá.

Saída:

A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares
*/

package dio.desafios;

import java.util.Scanner;

public class ClassificandoMatrizes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] nums = new int[N];
        int valorImpar = 0;

        for (int i = 0; i < N; i++) {

            nums[i] = input.nextInt();

        }

        for (int i = 0; i < N; i++) {

            if (nums[i] % 2 != 0) {

                valorImpar = nums[i];

                for (int j = 0; j < N; j++) {

                    if ((nums[j] % 2 == 0) && (j > i)) {

                        nums[i] = nums[j];
                        nums[j] = valorImpar;

                        break;

                    }

                }

            }

            System.out.println(nums[i]);

        }

        input.close();

    }

}
