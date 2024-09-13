package psbc;

import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {

        // Criação de um vetor, carregá-lo já inicializado e em seguida ler os elementos do vetor 
        // usando um For Each
        int[] vetorNumeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Varrendo o vetor sem uso do For Each
        System.out.println("Varrendo o vetor sem For Each");
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Nr : " + vetorNumeros[i]);
        }

        // Varrendo o vetor usando o For Each
        System.out.println("Varrendo o vetor usando o For Each");
        for (int obj : vetorNumeros) {
            System.out.println("Nr : " + obj);
        }

        /**
         * @author ${natan}
         * 
         * Exemplo com matriz
         */
        
        int[][] matrizNumeros = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        
        System.out.println("Varrendo a matriz usando o For Each");
        System.out.println("Linha, Coluna:");
        
        for (int[] i : matrizNumeros) {
        
            System.out.println(Arrays.toString(i));
        
        }
        
    }

}
