package psbc;

import java.util.Scanner;

public class ComandosEntradaSaida {

    public static void main(String[] args) {

        // 2 - Instanciar e criar um objeto Scanner
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        float f = leitor.nextFloat();
        double d = leitor.nextDouble();
        String s = leitor.next(); // Lê apenas uma palavra, não é permitido o uso do caractere 
        // espaço
        String ss = leitor.nextLine(); // Leitura de texto com mais de uma palavra

        /*
         * Como o método next retorna um texto precisamos pegar o caractere da primeira posição da
         * palavra para isso usamos o método charAt() na posição zero
         */

        char c = leitor.next().charAt(0);
        String texto = "Esse texto será impresso no console";
        String outroTexto = "Esse texto também será impresso no console";

        System.out.println(texto);
        System.out.print(outroTexto);

        leitor.close();
        
    }
    
}
