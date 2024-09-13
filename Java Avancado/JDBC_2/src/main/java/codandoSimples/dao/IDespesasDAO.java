package codandoSimples.dao;

import codandoSimples.model.Categoria;
import codandoSimples.model.Despesa;
import java.util.Optional;
import java.util.List;

public interface IDespesasDAO {

    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById();
    Optional<Despesa> findById(Long id);
    List<Despesa> findByCategoria(Categoria categoria);

}
