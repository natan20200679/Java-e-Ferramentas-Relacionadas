package gfg.exemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConteudoDiretorio {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nCaminho do diretório: ");
        String caminho = br.readLine();

        System.out.print("Nome do diretório: ");
        String nome = br.readLine();

        String caminhoCompleto =  caminho + File.separator + nome;

        System.out.println();

        File f = new File(caminho, nome);
        String[] lista = f.list();
        int n = lista.length;

        if (f.exists()) {

            for (int i = 0; i < n; i++) {

                System.out.print("\n" + lista[i]);

                File f1 = new File(caminhoCompleto, lista[i]);

                if (f1.isFile()) System.out.println(": é um arquivo.");
                if (f1.isDirectory()) System.out.println(": é um diretório");
            }

            System.out.println("\nNúmero de entradas neste diretório: " + n);
        
        } else System.out.println("Diretório não encontrado");
    }
}
