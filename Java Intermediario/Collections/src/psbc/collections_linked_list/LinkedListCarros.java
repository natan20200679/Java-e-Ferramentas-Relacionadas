/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.collections_linked_list;

import java.util.LinkedList;

public class LinkedListCarros {

    public static void main(String[] args) {

	    String carro;
	    LinkedList<String> cars = new LinkedList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    
	    // incluindo Mazda no inicio
	    cars.addFirst("Mazda");
	    System.out.println(cars);
	    
	    // Incluindo Bugatti no fim
	    cars.addLast("Bugatti");
	    System.out.println(cars);
	    
	    carro = cars.get(3);
	    System.out.println(carro);
	    
	    // removendo Mazda
	    cars.removeFirst();
	    System.out.println(cars);    
	    // pega o primeiro
	    System.out.println(cars.getFirst());
	    System.out.println(cars);
	    }
}
