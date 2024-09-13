package codandoSimples.dao;

import codandoSimples.infra.ConnectionFactory;
import codandoSimples.model.Categoria;
import codandoSimples.model.Despesa;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesasDAO {

    @Override
    public Despesa save(Despesa despesa) {

        try (Connection connection = ConnectionFactory.getConnection()) {

            String sql = "INSERT INTO Despesas (descricao, valor, data, categoria) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());
            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            
            resultSet.next();
           
            Long generatedId = resultSet.getLong("id");
            
            despesa.setId(generatedId);
       
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
      
        }

        return despesa;
    }

    @Override
    public Despesa update(Despesa despesa) {

        String sql = "UPDATE Despesas SET descricao = ?, valor = ?, data = ?, categoria = ? WHERE id = ?";

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4, despesa.getCategoria().toString());
            preparedStatement.setLong(5, despesa.getId());
            preparedStatement.executeUpdate();
       
        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
       
        }

        return despesa;
    }

    @Override
    public void delete(Long id) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            
            String sql = "DELETE from Despesas WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
      
        } catch (SQLException ex) {
           
            throw new RuntimeException(ex);
       
        }

    }

    @Override
    public List<Despesa> findAll() {

        String sql = "SELECT id, descricao, data, valor, categoria FROM Despesas";
        List<Despesa> despesas = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {
           
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
              
                Long id = resultset.getLong("id");
                String descricao = resultset.getString("descricao");
                LocalDate data = resultset.getDate("data").toLocalDate();
                double valor = resultset.getDouble("valor");
                Categoria categoria = Categoria.valueOf(resultset.getString("categoria"));

                /* A instrução abaixo deve ser usada caso se utilize o construtor da classe Despesa */
                Despesa despesa = new Despesa(id, descricao, data, valor, categoria);
                
                despesas.add(despesa);
           
            }

        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
      
        }

        return despesas;
   
    }

    @Override
    public Optional<Despesa> findById(Long id) {

        String sql = "SELECT id, descricao, data, valor, categoria FROM Despesas WHERE id = ?";
        Despesa despesa = null;

        try (Connection connection = ConnectionFactory.getConnection()) {
          
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setLong(1, id);
            
            ResultSet resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
               
                Long pkey = resultset.getLong("id");
                String descricao = resultset.getString("descricao");
                LocalDate data = resultset.getDate("data").toLocalDate();
                double valor = resultset.getDouble("valor");
                Categoria categoria = Categoria.valueOf(resultset.getString("categoria"));

                /* A instrução abaixo deve ser usada caso se utilize o construtor da classe Despesa */
                despesa = new Despesa(pkey, descricao, data, valor, categoria);

            }

        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);
        
        }

        return Optional.ofNullable(despesa);

        /* A instrução abaixo pode ser usada caso a implementação acima não seja usada. */
        // return Optional.empty();
    
    }

    @Override
    public Optional<Despesa> findById() {
       
        return Optional.empty();
    
    }

    @Override
    public List<Despesa> findByCategoria(Categoria categoria) {

        String sql = "SELECT id, descricao, data, valor, categoria FROM Despesas WHERE categoria = ?";    
        List<Despesa> despesas = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()) {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, categoria.toString());
            
            ResultSet resultset = preparedStatement.executeQuery();

            while (resultset.next()) {

                Long id = resultset.getLong("id");
                String descricao = resultset.getString("descricao");
                LocalDate data = resultset.getDate("data").toLocalDate();
                double valor = resultset.getDouble("valor");
                Categoria cat = Categoria.valueOf(resultset.getString("categoria"));

                /* A instrução abaixo deve ser usada caso se utilize o construtor da classe Despesa */
                Despesa despesa = new Despesa(id, descricao, data, valor, cat);
            
                despesas.add(despesa);
            
            }

        } catch (SQLException ex) {
            
            throw new RuntimeException(ex);       
        
        }

        return despesas;
    
    }

}
