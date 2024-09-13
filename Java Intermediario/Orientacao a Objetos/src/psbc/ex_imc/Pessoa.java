/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_imc;

/* Classe que representa uma pessoa */

public class Pessoa {

    /* Atributos de uma pessoa, necessários para a resolução do problema */

    public float peso;
    public float altura;

    /* Construtor */

    Pessoa() {}

    /* Ação que a pessoa pode executar */

    public float calcularIMC() {
        
        float imc = peso / (altura * altura);
        
        return imc;
    
    }

}
