/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_cadastros;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    /* Conexao ao Banco de Dados */
    Connection con;

    /* Acessa a Tabela ( insert, update, delete , select) */
    PreparedStatement stmt;

    /* Consulta a Tabela( select ) */
    ResultSet rs;
    
    /* Procedures e Function */
    CallableStatement call;  

    public void open() throws Exception {

        String url = "jdbc:postgresql://localhost:5432/cadastros";
        String user = "postgres";
        String password = "admin";

        try {

            Class.forName("org.postgresql.Driver");

            con = DriverManager.getConnection(url, user, password);

        } catch (SQLException | ClassNotFoundException ex) {

            System.out.println("Erro ao conectar com o banco");

        }

    }

    public void close() throws Exception {

        con.close();

    }

}
