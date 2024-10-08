/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.checkedExceptions;

import javax.swing.*;
import java.io.*;

/* Imprimir um arquivo no console. */

public class Ex_Arquivos {

    public static void main(String[] args) throws Exception {

        String nomeDoArquivo = "romance-blake-crouch.txt";

        try {

            imprimirArquivoNoConsole(nomeDoArquivo);

        } catch (FileNotFoundException e) {

            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! "
                            + e.getCause());
            e.printStackTrace();

        } catch (IOException e) {

            // e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());

        } finally {

            System.out.println("Chegou no finally!");

        }

        System.out.println("Apesar da exception ou não, o programa continua...");

    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws Exception {

        File file = new File(nomeDoArquivo);
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {

            bw.write(line);
            bw.newLine();

            line = br.readLine();

        } while (line != null);

            bw.flush();
            br.close();
    
    }

}
