/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses
atributos a classe deve conter os seguintes métodos:
 
a. abastecerPorValor -> Método onde é informado o valor a ser abastecido e mostra a quantidade de
                        litros que foi colocada no veículo.

b. abastecerPorLitro -> Método onde é informado a quantidade em litros de combustível e mostra o
                        valor a ser pago pelo cliente.

c. alterarValor -> Altera o valor do litro do combustível.

d. alterarCombustivel -> Altera o tipo do combustível.

e. alterarQuantidadeCombustivel -> Altera a quantidade de combustível restante na bomba.

Crie uma classe que contenha um método main para testar sua classe BombaCombustível
 */
package listaExerciciosLPAIIIPOO;

import java.util.Scanner;

public class E3 {

    public static void main(String[] args) {

        Scanner entradaDados = new Scanner(System.in);
        E3_BombaCombustivel bombaCombustivel = new E3_BombaCombustivel();

        System.out.print("\nValor (R$): ");
        double valor1 = entradaDados.nextDouble();

        System.out.printf("\nLitros: %.2f\n", bombaCombustivel.abastecerPorValor(valor1));

        System.out.print("\nLitros: ");
        double valor2 = entradaDados.nextDouble();
        
        System.out.printf("\nValor (R$): %.2f\n", bombaCombustivel
                .abastecerPorLitro(valor2));

        System.out.printf("\nAlterar Valor Litro Combustível (R$): ");
        double valor3 = entradaDados.nextDouble();
        
        bombaCombustivel.alterarValor(valor3);
        
        System.out.printf("\nNovo Valor Litro Combustível (R$): %.2f\n",
                bombaCombustivel.valorPorLitro);

        System.out.print("\nAlterar Tipo Combustível: ");
        String valor4 = entradaDados.next();
        
        bombaCombustivel.alterarCombustivel(valor4);
        
        System.out.print("\nNovo Tipo Combustível: " + bombaCombustivel.tipoCombustivel + "\n");

        System.out.print("\nAlterar Quantidade Combustível (Litros): ");
        double valor5 = entradaDados.nextDouble();
       
        bombaCombustivel.alterarQuantidadeCombustivel(valor5);
        
        System.out.print("\nNova Quantidade Combustível (Litros): "
                + bombaCombustivel.quantCombustivel + "\n");
        entradaDados.close();

    }

}
