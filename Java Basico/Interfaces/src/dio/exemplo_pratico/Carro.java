/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

 package dio.exemplo_pratico;

public interface Carro extends Automovel {

    @Override
    String marca();

    @Override
    Double valor();

    default void ligar() {

        System.out.println("Ligando o carro!");

    }

    default String codigoRenavan() {

        return "6533jijiio";

    }
}
