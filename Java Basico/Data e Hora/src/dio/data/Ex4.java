/*
 * Exemplo de utilização dos metodos compareTo e equals
 */

package dio.data;

import java.util.Date;

public class Ex4 {

    public static void main(String[] args) {

        // Tue Dec 12 22:26:47 BRST 2017
        Date dataNoPassado = new Date(1513124807691L);

        // Fri Feb 12 08:13:27 BRST 2021
        Date dataNoFuturo = new Date(1613124807691L);

        // Fri Feb 12 08:13:27 BRST 2021
        Date mesmaDataNoFuturo = new Date(1613124807691L);

        // Comparando se as datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        // True
        System.out.println(isEquals);

        // Comparando uma data com a outra
        // Passado -> Futuro
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);

        // Futuro -> Passado
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);

        // Datas Equivalentes
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);

        // -1
        System.out.println(compareCase1);

        // 1
        System.out.println(compareCase2);

        // 0
        System.out.println(compareCase3);
        
    }
    
}
