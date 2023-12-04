/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.exemplo_pratico;

public class Fiesta implements Carro, Veiculo {

    @Override
    public String marca() {

        return "Ford";

    }

    @Override
    public Double valor() {

        return null;

    }

    @Override
    public String registro() {

        return "123AFG547TR";

    }

    @Override
    public void ligar() {

        Carro.super.ligar();
        Veiculo.super.ligar();

    }
}
