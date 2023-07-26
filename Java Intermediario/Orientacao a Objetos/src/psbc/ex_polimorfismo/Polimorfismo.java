/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.ex_polimorfismo;

public class Polimorfismo {

    public static void main(String[] args) {
	
		Mamifero mamifero1 = new Elefante();
		System.out.println("Cota diária de leite de um Elefante :" + mamifero1.cotaDiariaLeite());

		Mamifero mamifero2 = new Rato();
		System.out.println("Cota diária de leite de um Rato :" + mamifero2.cotaDiariaLeite());
	}

}
