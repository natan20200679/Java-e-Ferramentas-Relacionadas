/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * O que acontece se tentarmos compilar e executar o seguinte código?
 *
 * class Teste {
 *      public static void main(String[] args) {
 *          char a = 'a'; // 'a' = 97
 *          char b = 'b'; // 'b' = 98
 *          System.out.println(a + b + "" + b + a);
 *      }
 * }
 *
 * a) abba
 * b) 97989897
 * c) 195ba
 * d) ab195
 * e) 390
 * f) Erro de Compilação
 * g) Erro em tempo de execução
 */
package exercicios_operadores_e_tiposPrimitivos;

public class E4 {

    public static void main(String[] args) {
        char a = 'a'; // 'a' = 97
        char b = 'b'; // 'b' = 98
        System.out.println(a + b + "" + b + a); // Ocorre o ítem c), pois a concatenação de variáveis do tipo char antes
        // de string(aspas duplas) corresponde à soma dos seus valores nativos hexadecimais, e após string corresponde à 
        // concatenação dos valores atribuídos à essas variáveis (que devem ser strings(aspas simples)
    }
    
}
