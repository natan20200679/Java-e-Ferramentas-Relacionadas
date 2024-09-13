/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dio;

import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonLazyHolder;
import dio.strategy.Comportamento;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoNormal;
import dio.strategy.Robo;

public class Test {

    public static void main(String[] args) {
        
        /* Teste de Padrão Criacional de projeto Singleton com 3 métodos */    
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        /* Teste de Padrão Comportamental de projeto Test */
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        /* Teste de Padrão Estrutural de projeto Facade */
        Facade facade = new Facade();
        
        facade.migrarCliente("Venilton", "14801788");
    
    }

}
