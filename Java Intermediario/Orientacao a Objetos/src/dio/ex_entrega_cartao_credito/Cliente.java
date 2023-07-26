/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.ex_entrega_cartao_credito;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco) {

        if (endereco == null) {
            throw new NullPointerException("Endereço não pode ser nulo!");
        }
        if (endereco.cep == null) {
            throw new NullPointerException("Cep não pode ser nulo!");
        }

        getEnderecos().add(endereco);

    }

    private List<Endereco> getEnderecos() {

        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }

        return enderecos;
    }
}
