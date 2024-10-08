/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.ex_alunos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    public static void main(String[] args) {

        /* 1 - NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso) */

        /* 2 - Definir parâmetros para se conectar ao banco de dados MySQL. */
        String driver = "mysql";
        String dataBaseAddress = "localhost";
        String dataBaseName = "digital_innovation_one";
        String user = "root";
        String password = "password";

        /* 3 - Construção da string de conexão. */
        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        /* sb.toString() == "jdbc:mysql://localhost/digital_innovation_one" */
        String connectionUrl = sb.toString(); 

        /*
        Carregar a classe específica de implementação do driver na memória da JVM. (A partir da versão JDBC 4 não é mais 
        necessário!!!). Ex.: Class.forName("com.mysql.jdbc.Driver");
         */

        /* 4 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário. */
        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password)) {

            System.out.println("SUCESSO ao se conectar ao banco MySQL!");

       } catch (SQLException e) {

            System.out.println("FALHA ao se conectar ao banco MySQL!");
            e.printStackTrace();
        
        }

    }

}
