/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_heranca1;

public class Fisica extends Pessoa {

    public String cpf;
    public String identidade;

    @Override
    public String toString() {
        
        return "Fisica [cpf=" + cpf + ", identidade=" + identidade + ", nome=" + nome + 
                ", situacaoPessoa=" + situacaoPessoa + "]";
    
    }

}
