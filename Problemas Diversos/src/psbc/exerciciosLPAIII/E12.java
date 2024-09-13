/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do 
distribuidor e dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, 
e depois o percentual do distribuidor sobre o resultado). Supondo que o percentual do distribuidor 
seja de 28% e os impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e 
informe o custo ao consumidor do mesmo 
 */
package exerciciosLPAIII;

import java.util.Scanner;

public class E12 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Custo de Fábrica do Veículo: R$ ");
        double custo_fabrica = leitor.nextDouble();

        double valor_fabrica = custo_fabrica + ((45d / 100d) * custo_fabrica);
        double valor_final = valor_fabrica + ((28d / 100d) * valor_fabrica);

        System.out.printf("Custo Total do Veículo: R$ %.2f \n", valor_final);
        leitor.close();
    
    }

}
