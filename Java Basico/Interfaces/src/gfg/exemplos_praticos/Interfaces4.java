/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 package gfg.exemplos_praticos;

interface A {

    void method1();
    void method2();

}

interface B extends A {

    void method3();

}

class Interfaces4 implements B {

    @Override
    public void method1() {

        System.out.println("Method 1");

    }

    @Override
    public void method2() {

        System.out.println("Method 2");

    }

    @Override
    public void method3() {

        System.out.println("Method 3");

    }

    public static void main(String[] args) {

        Interfaces4 e = new Interfaces4();

        e.method1();
        e.method2();
        e.method3();

    }

}