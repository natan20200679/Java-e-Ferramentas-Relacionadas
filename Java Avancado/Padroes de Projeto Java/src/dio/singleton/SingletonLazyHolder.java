/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Singleton "Lazy Holder". @see <a href="https://stackoverflow.com/a/24018148"> Referencia </a> */

package dio.singleton;

public class SingletonLazyHolder {

    private static class InstanceHolder {

        private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    
    }

    private SingletonLazyHolder() {}

    public static SingletonLazyHolder getInstancia() {
        
        return InstanceHolder.instancia;
    
    }

}
