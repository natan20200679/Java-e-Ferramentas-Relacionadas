/*
 * Exemplo de como manipular LocalDateTime
 */

package dio.dataLocal;

import java.time.LocalDateTime;

public class Ex5 {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        // 2019-07-15T00:02:16.076
        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        // 2019-07-17T01:02:28.076
        System.out.println(futuro);
               
    }
    
}