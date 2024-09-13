/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

package desafios;

public class OrdemInversa2 {

    public static void main(String[] args) {

        /* Inicializando um vetor com 5 elementos. */

        int[] vetor = {5, 8, 9, 6, 11, -1};

        /* O contador deverá ser um número menor que o tamanho do vetor. */        
        
        int count = (vetor.length - 1);

        /* Frase ilustrativa */

        System.out.print("Vetor Inverso: ");

        /* Enquanto o contador tiver o valor maior ou igual 0 */ 
        
        while (count >= 0) {

            /* Imprima o valor do elemento do vetor na posição indicada pelo contador. */

            System.out.print(vetor[count] + " ");

            /* Diminua o valor 1 do contador a cada loop */

            count--;
        
        }

        /* Separar os vetores */

        System.out.println("\n--------------");

        /* Frase ilustrativa */

        System.out.print("Vetor: ");

        /* Para cada elemento dentro do vetor */

        for (int elemento : vetor) {

            /* Imprima o elemento */
             
            System.out.print(elemento + " ");
        
        }
    
    }

}
