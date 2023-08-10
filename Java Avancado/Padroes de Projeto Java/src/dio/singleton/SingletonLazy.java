/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Singleton "preguiçoso".
*/

package dio.singleton;

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
    
    }

    public static SingletonLazy getInstancia() {
    
        if (instancia == null) {
        
            instancia = new SingletonLazy();
        
        }
        
        return instancia;
    
    }

}
