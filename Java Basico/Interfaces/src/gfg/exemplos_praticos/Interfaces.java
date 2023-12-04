/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gfg.exemplos_praticos;

interface In1 {

    final int a = 10;

    void display();

}

public class Interfaces implements In1 {

    public static void main(String[] args) {

        Interfaces t = new Interfaces();

        t.display();

        System.out.println(a);

    }

    public void display() {

        System.out.println("Geek");

    }

}
