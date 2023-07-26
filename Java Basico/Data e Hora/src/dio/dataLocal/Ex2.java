/*
 * Exemplo de como manipular LocalDate
 */

package dio.dataLocal;

import java.time.LocalDate;

public class Ex2 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        // 2019-07-14
        System.out.println(hoje);

        // 2019-07-13
        System.out.println(ontem);

    }
    
}