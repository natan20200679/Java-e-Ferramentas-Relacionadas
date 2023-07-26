/*
 * Exemplo de conversão entre Date e Instant
 */

package dio.data;

import java.time.Instant;
import java.util.Date;

public class Ex5 {

    public static void main(String[] args) {

        Date dataInicio = new Date(1513124807691L);

        // Tue Dec 12 22:26:47 BRST 2017
        System.out.println(dataInicio);

        Instant instant = dataInicio.toInstant();

        // 2017-12-13T00:26:47.691Z
        System.out.println(instant);
        
    }
    
}