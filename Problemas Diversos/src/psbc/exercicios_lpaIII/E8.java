/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
 * O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário 
 */

package exercicios_lpaIII;

import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Valor Cotação (U$): ");
        double dolarCota = leitor.nextDouble();
        
        System.out.println("Valor Disponível (U$): ");
        double dolarDisp = leitor.nextDouble();

        double realCota = dolarCota * 5.20;
        double realDisp = dolarDisp * 5.20;
        
        System.out.printf("Valor Cotação (R$): R$ %.2f \n", realCota);
        System.out.printf("Valor Disponível (R$): R$ %.2f \n", realDisp);

        leitor.close();
    }
}
