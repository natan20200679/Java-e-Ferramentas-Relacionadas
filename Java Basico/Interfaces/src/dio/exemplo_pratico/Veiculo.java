/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

 package dio.exemplo_pratico;

public interface Veiculo {

    String registro();

    default void ligar() {

        System.out.println("Ligando o veículo!");

    }

    // void desligar();

    // default void desligar() {  

    //     System.out.println("Desligando o veículo!");  
    
    // }

}
