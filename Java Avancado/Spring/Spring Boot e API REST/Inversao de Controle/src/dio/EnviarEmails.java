/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio;

public class EnviarEmails {

    public EnviarEmails(String tipo, String endereco, String senha) {

    }

    public static EnviarEmails obterDadosEmail() {

        return new EnviarEmails("smtp", "contato@email.com", "senha");

    }

    public void retornar(String mensagem) {

        System.out.println("Email enviado!");

    }

}
