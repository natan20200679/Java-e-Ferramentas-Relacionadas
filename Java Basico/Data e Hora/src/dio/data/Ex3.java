/*
 * Exemplo de utilização dos metodos after e before
 */

package dio.data;

import java.util.Date;

public class Ex3 {

    public static void main(String[] args) {

        // Tue Dec 12 22:26:47 BRST 2017
        Date dataNoPassado = new Date(1513124807691L);

        // Fri Feb 12 08:13:27 BRST 2021
        Date dataNoFuturo = new Date(1613124807691L);

        // Comparando se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        // False
        System.out.println(isAfter);

        // Comparando se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        // True
        System.out.println(isBefore);
        
    }

}