/*
 * Exemplo de utilização do construtor com passagem de parametro em milisegundos
 */

package dio.data;

import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        // 1563127311564
        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        // Sun Jul 14 15:01:51 BRT 2019
        System.out.println(novaData);
        
    }

}

