package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * @author Natanael Medrado
 *
 */

public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
