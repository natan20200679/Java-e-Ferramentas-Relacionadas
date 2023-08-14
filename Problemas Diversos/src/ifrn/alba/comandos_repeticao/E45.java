/*
Uma loja de animais vende gatos e cachorros. Escreva um algoritmo que leia a quantidade de animais 
da loja e, para cada animal, leia a informação do tipo do animal (se é gato ou cachorro). Ao final,
exiba a quantidade de animais que são gatos e a quantidade de animais que são cachorros existentes 
na loja
 */
package ifrn.alba.comandos_repeticao;

import java.util.Objects;
import java.util.Scanner;

public class E45 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("\nInforme a quantidade de animais: ");
        int quant = leitor.nextInt();
        
        String animal;
        int gatos = 0, cachorros = 0;
        
        for (int i = 0; i < quant; i++) {
        
            System.out.println("Informe o tipo do animal(gato ou cachorro, apenas letras " + ""
                    + "minúsculas): ");
            animal = leitor.next();
            
            if (Objects.equals(animal, "gato")) {
            
                gatos += 1;
            
            } else if (Objects.equals(animal, "cachorro")) {
            
                cachorros += 1;
            
            }
        
        }
        
        System.out.println("\nGatos: " + gatos + "  Cachorros: " + cachorros);
        leitor.close();
    
    }

}
