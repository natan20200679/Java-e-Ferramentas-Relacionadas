/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 package gfg.exemplos_praticos;

interface API {

    default void show() {

        System.out.println("Default API");
        System.out.println(Interface1.c);
        System.out.println(Interface2.d);
    }

}

interface Interface1 extends API {

    final int c = 15;

}

interface Interface2 extends API {

    final int d = 20;

}

class Interfaces3 implements Interface1, Interface2 {

    public static void main(String args[]) {

        Interfaces3 d = new Interfaces3();

        d.show();

    }

}
