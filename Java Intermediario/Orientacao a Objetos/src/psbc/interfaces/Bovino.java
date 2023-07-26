/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package psbc.interfaces;

public class Bovino implements Animal {

    @Override
	public void animalSom() {
		System.out.println("Muuuu");
	}

	@Override
	public void animalComer() {
		System.out.println("Comendo capim");	
	}
}
