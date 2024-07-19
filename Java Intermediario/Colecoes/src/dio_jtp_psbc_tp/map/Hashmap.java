/*
Exemplo do site tutorialspoint(tp). Obs.: Este exemplo mescla mais de um exemplo do site.
 */

package dio_jtp_psbc_tp.map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    public static void main(String[] args) {

        Map<String, String> m1 = new HashMap<>();

        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

        m1.remove("Daisy");
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

    }

}
