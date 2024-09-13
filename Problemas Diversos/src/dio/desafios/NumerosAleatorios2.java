/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package desafios;

import java.util.Random;

public class NumerosAleatorios2 {

    public static void main(String[] args) {

        /* Classe para gerar números aleatórios */

        Random random = new Random();

        /* Array com 20 posições */

        int[] numeros = new int[20];

        /* 
        Para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a 
        cada loop.
        */ 
        
        for (int i = 0; i < numeros.length; i++) {

            /* Pegando um número aleatório entre 0 e 100. */

            int numero = random.nextInt(100);

            /* Atribuindo esse valor ao elemento na respectiva posição do array numeros. */

            numeros[i] = numero;
        
        }

        /* Frase ilustrativa */

        System.out.print("Numeros: ");

        /* Loop for-each para cada numero dentro do array de números */

        for (int numero : numeros) {

            /* Imprima o número */

            System.out.print(numero + " ");
        
        }

        /* Separar os vetores */

        System.out.println("\n-----------------");

        /* Frase ilustrativa */

        System.out.print("Sucessores: ");

        /* Para cada numero dentro do array de números */

        for (int numero : numeros) {

            /* Adicione o valor 1 ao número e imprima esse novo valor */
             
            System.out.print((numero + 1) + " ");
        
        }
    
    }

}
