/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_cadastros;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO extends DAO {

    public void incluirPessoa(Pessoa p) throws Exception {

        open();

        stmt = con.prepareStatement("insert into pessoa values(?,?,?)");

        stmt.setInt(1, p.getIdPessoa());
        stmt.setString(2, p.getNomePessoa());
        stmt.setString(3, p.getEmail());
        stmt.execute();
        stmt.close();

        close();

    }

    public void alterarPessoa(Pessoa p) throws Exception {

        open();

        stmt = con.prepareStatement("update Pessoa set nomepessoa = ?, email = ? where idPessoa = ?");

        stmt.setString(1, p.getNomePessoa());
        stmt.setString(2, p.getEmail());
        stmt.setInt(3, p.getIdPessoa());
        stmt.execute();
        stmt.close();

        close();

    }

    public void excluirPessoa(Pessoa p) throws Exception {

        open();

        stmt = con.prepareStatement("delete from Pessoa where idPessoa = ?");

        stmt.setInt(1, p.getIdPessoa());
        stmt.execute();
        stmt.close();

        close();

    }

    /* Retornando um objeto */
    public Pessoa consultarPessoaIndividual(int cod) throws Exception {

        open();

        stmt = con.prepareStatement("select * from pessoas where idPessoa = ? ");

        stmt.setInt(1, cod);

        try {

            rs = stmt.executeQuery();

        } catch (SQLException ex) {

            throw new Exception(ex);

//            System.out.println("Falha ao recuperar o registro. Contate TI");
        
        } finally {

            System.out.println("Fechando a conexão com banco de dados no Finally");

            close();

        }

        Pessoa p = null;

        if (rs != null) {

            if (rs.next()) {

                p = new Pessoa();

                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNomePessoa(rs.getString("nomePessoa"));
                p.setEmail(rs.getString("email"));

            }

        }

        close();

        return p;

    }

    public List<Pessoa> ListarPessoas() {

        try {

            open();

            stmt = con.prepareStatement("select * from pessoa");
            rs = stmt.executeQuery();

            List<Pessoa> listaPessoas = new ArrayList<>();

            while (rs.next()) {

                Pessoa p = new Pessoa();

                p.setIdPessoa(rs.getInt("idPessoa"));
                p.setNomePessoa(rs.getString("nomePessoa"));
                p.setEmail(rs.getString("email"));
                listaPessoas.add(p);

            }

            close();

            return listaPessoas;

        } catch (Exception e) {

            System.out.println(e.getMessage());

            return null;

        }

    }

}
