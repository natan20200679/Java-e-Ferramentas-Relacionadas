/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Crie um optional de um determinado tipo de dado (R)
Crie com estado vazio, estado presente, e com null (R)
Se presente, exiba o valor no console. Se vazio, exiba 'Optional vazio' no console (R)
Se vazio, lance uma exceção IlegalStateException (R)
Se presente, transforme o valor e exiba no console (R)
Se presente, pegue o valor do optional e atribua em uma variável (R)
Se presente, filtre o optional com uma determinada regra de negócio (R)
 */

package dio.optionals;

import java.util.Optional;

public class Ex {

    public static void main(String[] args) {

        Optional<Integer> estadoExcecao = Optional.of(1);

        estadoExcecao.ifPresentOrElse(System.out::println, () -> System.out.println
        ("Optional vazio"));

        if (estadoExcecao.isPresent()) {
        
            Integer valor = estadoExcecao.get();
            
            System.out.println(estadoExcecao);

            if (valor != 1) System.out.println("Optional diferente de 1");
        
        }

        estadoExcecao.orElseThrow(IllegalStateException::new);

        Optional<Integer> estadoNull = Optional.ofNullable(null);
        
        estadoNull.ifPresentOrElse(System.out::println, () -> System.out.println("null"));
        System.out.println(estadoNull);

        Optional<Integer> estadoEmpty = Optional.empty();
        
        estadoEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("empty = 0"));
        System.out.println(estadoEmpty);

        Optional<Integer> estadoNullErro = Optional.of(null);
        
        estadoNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Estado 0"));
        System.out.println(estadoNullErro);

    }

}
