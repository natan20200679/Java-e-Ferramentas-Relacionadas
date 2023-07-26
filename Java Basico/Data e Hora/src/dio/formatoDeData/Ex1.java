/*
 * Exemplo de formatação de data com DateFormat
 */

package dio.formatoDeData;

import java.text.DateFormat;
import java.util.Date;

public class Ex1 {

    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);

        // 15/07/19 22:13
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        
        // 15 de Julho de 2019 22:13
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        
        // 15 de Julho de 2019 22h13min55s BRT
        System.out.println(dateToStr);
        
    }
    
}