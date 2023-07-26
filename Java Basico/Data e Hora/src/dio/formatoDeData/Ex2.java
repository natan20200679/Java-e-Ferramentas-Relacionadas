/*
 * Exemplo de formatação de data com SimpleDateFormat
 */

package dio.formatoDeData;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex2 {

    public static void main(String[] args) {

        Date agora = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        // 14/07/2019
        System.out.println(dataFormatada);

    }

}
