/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
 * Informar a quantidade de aeronaves no pátio, o nr dos vôos por ordem de chegada. 
 * A ordem de decolagem é FIFO, o primeiro que entra é o primeiro que sai. 
 * Mostrar qual o primeiro vôo á decolar
 */
package psbc.ex_aeronaves;

import java.util.Scanner;

import src.psbc.ex_aeronaves.Aeronaves;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aeronaves air = new Aeronaves();

        System.out.println("Informe o nr de aeronaves");

        int nrAeronaves = sc.nextInt();

        // adicionando voos
        for (int i = 0; i < nrAeronaves; i++) {

            int nrVoo = sc.nextInt();

            air.addVoo(nrVoo);

        }

        System.out.println("O primeiro a decolar vai ser o nr : " + air.primeiroVoo());

        air.listaVoos();
        sc.close();

    }

}
