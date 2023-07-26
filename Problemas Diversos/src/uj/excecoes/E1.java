/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Crie uma classe que aceite a digitação de dois números e faça a divisão entre eles exibindo seu resultado. Sua classe
 * deve tratar as seguintes exceções:
 *
 * ArithmeticException -> quando ocorrer uma divisão por zero.
 * InputMismatchException -> quando o valor informado não é numerico.
 */
package uj.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {

        try {
            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int a = leitor.nextInt();
            System.out.print("Digite o segundo número: ");
            int b = leitor.nextInt();
            System.out.println("a / b = " + divisao(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não permitida!");
        } catch (InputMismatchException e) {
            System.out.println("O(s) valor(es) informado(s) não é(são) numérico(s)!");
        }
    }

    static int divisao(int a, int b) {
        return a / b;
    }

}
