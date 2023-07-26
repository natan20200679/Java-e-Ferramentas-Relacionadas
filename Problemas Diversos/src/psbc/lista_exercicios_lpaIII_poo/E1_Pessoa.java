/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.lista_exercicios_lpaIII_poo;

public class E1_Pessoa {

     private String nome;
    private String data_nascimento;
    private String altura;
    
    public int idade(int ano_nascimento, int ano_atual) {
        return ano_atual - ano_nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "E1_Pessoa [altura=" + altura + ", data_nascimento=" + data_nascimento + 
        ", nome=" + nome + "]";
    }
}
