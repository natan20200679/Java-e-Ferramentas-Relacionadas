/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* 
Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e
altura. Crie os métodos públicos necessários para getters e setters e também um método para 
imprimir todos dados de uma pessoa. Crie um método para calcular a idade da pessoa 
*/

package psbc.lista_exercicios_lpaIII_poo;

public class E1 {

    public static void main(String[] args) {
        
        E1_Pessoa pessoa = new E1_Pessoa();

        pessoa.setNome("joao");
        pessoa.idade(2000, 2022);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.idade(2000, 2022));
    
    }

}
