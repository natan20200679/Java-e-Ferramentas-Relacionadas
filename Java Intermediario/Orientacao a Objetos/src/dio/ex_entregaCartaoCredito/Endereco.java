/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.ex_entregaCartaoCredito;

public class Endereco {

    public enum TipoEndereco {

        RESIDENCIAL, ENTREGA, TRABALHO
    
    }

    public String endereco;
    public String numero;
    public String complemento;
    public String bairro;
    public String estado;
    public String cep;

}
