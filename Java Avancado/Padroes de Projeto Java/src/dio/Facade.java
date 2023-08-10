/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperaEstado(cep);
        
        CRMService.gravarCliente(nome, cep, cidade, estado);
    
    }

}
