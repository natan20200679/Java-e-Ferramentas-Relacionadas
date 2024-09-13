/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /* 
Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio 
(desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A 
classe deve também disponibilizar os seguintes métodos:

a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
               prédio (os elevadores sempre começam no térreo e vazio);

b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);

c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);

d. Sobe: para subir um andar (não deve subir se já estiver no último andar);

e. Desce: para descer um andar (não deve descer se já estiver no térreo); 
 */
package listaExerciciosLPAIIIPOO;

public class E4 {

    public static void main(String[] args) {
        
        E4_Elevador elevador = new E4_Elevador();
        
        System.out.println("\n" + elevador.inicializa(6, 10));
        System.out.println(elevador.desce());
        System.out.println(elevador.sobe());
    
    }

}
