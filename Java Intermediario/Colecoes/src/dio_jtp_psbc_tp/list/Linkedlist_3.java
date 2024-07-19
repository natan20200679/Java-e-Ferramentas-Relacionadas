/*
Exemplo do bootcamp programa start by capgemini(psbc)
 */

package dio_jtp_psbc_tp.list;

import java.util.LinkedList;

public class Linkedlist_3 {

    public static void main(String[] args) {

        String carro;
        LinkedList<String> cars = new LinkedList<>();
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
