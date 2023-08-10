/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Singleton "apressado".
*/

package dio.singleton;

public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        
    }

    public static SingletonEager getInstancia() {
        
        return instancia;
    
    }

}
