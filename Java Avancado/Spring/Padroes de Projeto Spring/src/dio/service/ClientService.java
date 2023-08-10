/**
 * Interface que define o padrão <b>Strategy</b>(padrão de projeto) no domínio
 * de cliente. Com isso, se necessário, podemos ter multiplas implementações
 * dessa mesma interface.
 *
 * @author falvojr
 */

package dio.service;

import one.digitalinnovation.gof.model.Cliente;

public interface ClientService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
