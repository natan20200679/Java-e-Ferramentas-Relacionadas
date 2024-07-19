/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio.ex_entregaCartaoCredito;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {

        FÍSICA, JURÍDICA
    
    }

    public Integer codigo;
    public String nome;
    private String documento;
    public TipoPessoa tipo;

    public String getDocumento() {

        return documento;
    
    }

    public void setDocumento(String documento) {

        if (documento == null || documento.isEmpty()) {
    
            throw new RuntimeException("Documento não pode ser nulo ou vazio");
        
        }
        
        if (documento.length() == TAMANHO_CPF) {
        
            setDocumento(documento, tipo = TipoPessoa.FÍSICA);

        } else if (documento.length() == TAMANHO_CNPJ) {
            
            setDocumento(documento, tipo = TipoPessoa.JURÍDICA);
        
        } else {
        
            throw new RuntimeException("Documento inválido para pessoa física ou jurídica");
        
        }

        this.documento = documento;

    }

    private void setDocumento(String documento, TipoPessoa tipo) {

        this.documento = documento;
        this.tipo = tipo;
    
    }

    public TipoPessoa getTipo() {

        return tipo;
    
    }

}
