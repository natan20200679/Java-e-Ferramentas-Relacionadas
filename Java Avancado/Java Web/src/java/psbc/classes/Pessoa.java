/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.classes;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import psbc.utils.Conexao;

public class Pessoa {
    
    private int idPessoa;
    private String nomePessoa;
    private String email;
    private int setIdPessoa;
    private String setNomePessoa;
    private String setEmail;

    public boolean incluirPessoa() {
        
        String sql = "insert into pessoa";
        sql += "(nomePessoa, email) ";
        sql += "values(?, ?) ";
        Connection con = Conexao.conectar();

        try {
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, this.nomePessoa);
            stm.setString(2, this.email);
            stm.execute();
        
        } catch (SQLException ex) {
        
            System.out.println("Erro! " + ex.getMessage() + sql);
            
            return false;
        
        }
        
        return true;
    
    }

    public boolean alterarPessoa() {
    
        Connection con = Conexao.conectar();
        String sql = "update pessoa ";
        
        sql += "set nomePessoa = ?, ";
        sql += " email = ? ";
        sql += "where idPessoa = ?";

        try {
        
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setString(1, this.nomePessoa);
            stm.setString(2, this.email);
            stm.setInt(3, this.idPessoa);
            stm.execute();
        
        } catch (SQLException ex) {
        
            System.out.println("Erro! " + ex.getMessage() + sql);
            
            return false;
        
        }

        return true;
    
    }

    public boolean exluirPessoa() {
    
        Connection con = Conexao.conectar();
        String sql = "delete from pessoa ";
        sql += " where idPessoa = ?";

        try {
        
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt(1, this.idPessoa);
            stm.execute();
        
        } catch (SQLException ex) {
        
            System.out.println("Erro! " + ex.getMessage() + sql);
            
            return false;
        
        }

        return true;
    
    }

    public List<Pessoa> consultarPessoas() {
    
        List<Pessoa> lista = new ArrayList<>();
        Connection con = Conexao.conectar();
        String sql = "select idPessoa, nomePessoa, email ";
        sql += "from pessoa ";
        sql += "order By 2";

        try {
        
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
            
                Pessoa pessoa = new Pessoa();
                pessoa.setIdPessoa = (rs.getInt("idPessoa"));
                pessoa.setNomePessoa = (rs.getString("nomePessoa"));
                pessoa.setEmail = (rs.getString("email"));

                lista.add(pessoa);
            
            }

        } catch (SQLException ex) {
            
            System.out.println("Erro! " + ex.getMessage() + sql);
        
        }

        return lista;
    
    }

    public Pessoa consultarPessoa(int pIdPessoa) {
    
        Connection con = Conexao.conectar();
        String sql = "select idPessoa, nomePessoa, email";
        sql += "from pessoa ";
        sql += "where idPessoa = ? ";
        Pessoa colab = null;

        try {
        
            PreparedStatement stm = con.prepareStatement(sql);
            
            stm.setInt(1, idPessoa);
            
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
            
                Pessoa pes = new Pessoa();
                
                pes.setIdPessoa(rs.getInt("idPessoa"));
                pes.setNomePessoa(rs.getString("nomePessoa"));
                pes.setEmail(rs.getString("email"));
            
            }

        } catch (SQLException ex) {
            
            System.out.println("Erro! " + ex.getMessage() + sql);

        }
        
        return colab;
    
    }

    public int getIdPessoa() {
    
        return idPessoa;
    
    }

    public void setIdPessoa(int idPessoa) {
    
        this.idPessoa = idPessoa;
    
    }

    public String getNomePessoa() {
    
        return nomePessoa;
    
    }

    public void setNomePessoa(String nomePessoa) {
    
        this.nomePessoa = nomePessoa;
    
    }

    public String getEmail() {
    
        return email;
    
    }

    public void setEmail(String email) {
    
        this.email = email;
    
    }
    
}
