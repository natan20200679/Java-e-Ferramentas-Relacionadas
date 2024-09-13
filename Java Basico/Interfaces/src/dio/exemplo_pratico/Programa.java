/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 package dio.exemplo_pratico;

public class Programa {

    public static void main(String[] args) {

        final Carro gol = new Gol();

        System.out.println("Marca do Gol : " + gol.marca());
        gol.ligar();
        
        final Veiculo trator = new Trator();

        System.out.println("Registro do Trator :" + trator.registro());
        trator.ligar();

        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do Fiesta : " + fiesta.marca());
        System.out.println("Registro do Fiesta : " + fiesta.registro());
        fiesta.ligar();

        // Método "ligar()" só pode ser acessado por quem implementa (classe) a classe "Carro"
        // Carro.super.ligar();   
    }
}
