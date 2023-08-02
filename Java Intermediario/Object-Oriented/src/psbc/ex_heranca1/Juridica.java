/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_heranca1;

public class Juridica extends Pessoa {

    public String cnpj;
    public String inscEstadual;

    @Override
    public String toString() {
        
        return "Juridica [cnpj=" + cnpj + ", inscEstadual=" + inscEstadual + ", nome=" + nome + 
                ", situacaoPessoa=" + situacaoPessoa + "]";
    
    }

}
