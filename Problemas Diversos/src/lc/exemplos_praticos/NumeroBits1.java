/*
Escreva uma função que pegue a representação binária de um inteiro não assinado e retorne o número de bits '1'
que ele tem (também conhecido como peso Hamming).
 */

package lc.exemplos_praticos;

import java.io.IOException;
import java.util.Scanner;

public class NumeroBits1 {

    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);

        System.out.print("\nDigite um valor binário de 32 bits: ");

        String s = reader.next();

        int n = Integer.parseUnsignedInt(s, 2);

        System.out.println("O peso Hamming deste número é: " + hammingWeight(n));

        reader.close();

//        Outra alternativa, envolvendo leitura e impressão de dados (Linhas 31 à 41):

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.print("\nDigite um valor binário de 32 bits: ");
//
//        String s = br.readLine().trim();
//
//        int n = Integer.parseUnsignedInt(s, 2);
//
//        System.out.println("O peso Hamming deste número é: " + hammingWeight(n));
//
//        br.close();

    }

    public static int hammingWeight(int n) {

        int count = 0;

        for (int i = 0; i < 32; i ++) {

            if ((n & 1) == 1) count ++;

            n >>= 1;

        }

        return count;

    }

}