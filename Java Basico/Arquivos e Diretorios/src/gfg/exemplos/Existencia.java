package gfg.exemplos;

import java.io.File;

public class Existencia {

    public static void main(String[] args) {

        File arquivo = new File("/home/natanael/SoftMaker/license-pt-br.rtf");
        boolean existencia = arquivo.exists();

        if (existencia) {

            System.out.println("\nArquivo 'license-pt-br.rtf' existe.");
            System.out.println("Hierarquia: " + arquivo.getParent());

            boolean leitura = arquivo.canRead();
            boolean escrita = arquivo.canWrite();
            boolean diretorio = arquivo.isDirectory();

            if (leitura) System.out.println("Arquivo 'license-pt-br.rtf' permite leitura.");
            else System.out.println("Arquivo 'license-pt-br.rtf' não permite leitura.");

            if (escrita) System.out.println("Arquivo 'license-pt-br.rtf' permite escrita.");
            else System.out.println("Arquivo 'license-pt-br.rtf' não permite escrita.");

            if (diretorio) System.out.println("Arquivo 'license-pt-br.rtf' é um diretório.");
            else System.out.println("Arquivo 'license-pt-br.rtf' não é um diretório.");

            System.out.println("Tamanho do arquivo: " + arquivo.length() + " bytes");
        
        } else System.out.println("\nArquivo 'license-pt-br.rtf' não existe.");
    }
}
