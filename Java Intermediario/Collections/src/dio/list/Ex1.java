/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Exercício com método de implementação Linkedlist
*/

package dio.list;

import java.util.LinkedList;
import java.util.List;

class Ex1 {
    public static void main(String[] args) {
        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(7.0);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: " + notas2);
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.remove(0) + " " + notas2);
    }
}