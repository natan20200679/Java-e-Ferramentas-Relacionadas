/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    public static Connection conectar() {
        
        throw new UnsupportedOperationException("Not supported yet."); 
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
    }
    
    Connection con;
    
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
