/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio;

public class CepApi {

    private static final CepApi instancia = new CepApi();

    private CepApi() {}

    public static CepApi getInstancia() {
        
        return instancia;
    
    }

    public String recuperarCidade(String cep) {
    
        return "Araraquara";
    
    }

    public String recuperaEstado(String cep) {
    
        return "SP";
    
    }

}
