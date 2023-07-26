/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n. 
Fazemos um fatorial desacnteitado usando os inteiros em ordem decrescente, trocando as operações de 
multiplicação por uma rotação fixa de operações cucnta ordem é: multiplicar '*', dividir '/', adicionar '+' e 
subtrair '-'. Por exemplo, desacnteitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no 
fatorial desacnteitado as operações ainda são aplicadas usando a ordem usual de operações aritméticas. Além 
disso, a divisão neste caso sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N,
retorne o fatorial desacnteitado de n.

Entrada
A entrada consiste em um valor inteiro positivo N.

Saída
A saída consiste em retornar o valor do seu fatorial desacnteitado de N.
*/

package dio.desafios;

public class FatorialDesajeitado {

    public static void main(String[] args) {
        
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println(FatorialDesajeitado.calcular(n));
        
    }

    public static int calcular(int n) {
        
        int res = 0;
        int tmp = n;
        int cnt = 0;
        char[] operador = new char[]{'*', '/', '+', '-'};

        for (int i = n - 1; i >= 1; --i) {
            
            if (operador[cnt] == '*') {
               
                tmp *= i;
                
            } else if (operador[cnt] == '/') {
                
                tmp /= i;
                
            } else if (operador[cnt] == '+') {
                
                res += i;
                
            } else {
                
                res += (i == n - 4) ? tmp : -tmp;
                tmp = i;
                
            }
            
            cnt = (cnt + 1) % 4;
            
        }

        return res + ((n <= 4) ? tmp : -tmp);

    }

}
