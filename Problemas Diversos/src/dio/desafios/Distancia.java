/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e 
a moto Y sai com velocidade constante de 90 Km/h. Em uma hora (60 minutos) a moto Y consegue se 
distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos. 
O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y 
tomar essa distância da outra moto.

Entrada:

O arquivo de entrada contém um número inteiro K que representa a quantidade de quilômetro que que 
a moto Y deve estar da moto X.

Saída:

Imprima o tempo necessário para a moto Y ficar com a quantidade K de quilômetro da moto X, seguido 
da mensagem " minutos".
*/

package desafios;

import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) {

        int minutos;

        Scanner input = new Scanner(System.in);
        minutos = input.nextInt();
        int K = (minutos) * 2;

        System.out.printf(K + " minutos"); // Digite aqui o calculo dos minutos
        input.close();

    }

}
