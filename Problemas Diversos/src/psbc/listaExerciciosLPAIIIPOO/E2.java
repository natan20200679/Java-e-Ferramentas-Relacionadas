/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /* 
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos:
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são 
obrigatórios 
 */
package listaExerciciosLPAIIIPOO;

public class E2 {

    public static void main(String[] args) {

        E2_ContaCorrente cc = new E2_ContaCorrente();
        cc.setNome("natan");
        cc.setNumero_conta("0349872-7");

        System.out.println(cc);

    }

}
