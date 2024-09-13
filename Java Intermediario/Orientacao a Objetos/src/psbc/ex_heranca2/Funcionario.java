/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_heranca2;

import java.util.Date;

public class Funcionario {

    /* Atributos (Estão privados para garantir o encapsulamento das informações de cada objeto) */

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private Double salario;

    /* Construtor */

    public Funcionario(String nome, Date dataNascimento, String cpf, Double salario) {
        
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.salario = salario;
    
    }

    /* Getters e Setters */

    public String getNome() {
        
        return nome;
    
    }

    public void setNome(String nome) {
    
        this.nome = nome;
    
    }

    public Date getDataNascimento() {
    
        return dataNascimento;
    
    }

    public void setDataNascimento(Date dataNascimento) {
    
        this.dataNascimento = dataNascimento;
    
    }

    public String getCpf() {
    
        return cpf;
    
    }

    public void setCpf(String cpf) {
    
        this.cpf = cpf;
    
    }

    public Double getSalario() {
    
        return salario;
    
    }

    public void setSalario(Double salario) {
    
        this.salario = salario;
    
    }
    
    public String mostrarDados(){
    
        return "Nome: " + this.getNome() + "\n" +
               "Data de nascimento: " + getDataNascimento().toString() + "\n" +
               "CPF: " + this.getCpf() + "\n " +
               "Salário: " + getSalario();
    
    }

}
