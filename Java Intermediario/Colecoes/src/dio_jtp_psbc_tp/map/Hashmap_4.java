/*
Exemplo do site tutorialspoint(tp). Obs.: Este exemplo mescla mais de um exemplo do site.
 */

package dio_jtp_psbc_tp.map;

import java.util.*;

import static java.lang.Double.valueOf;

public class Hashmap_4 {

    public static void main(String args[]) {

        HashMap hm = new HashMap();

        hm.put("Zara", valueOf(3434.34));
        hm.put("Mahnaz", valueOf(123.22));
        hm.put("Ayan", valueOf(1378.00));
        hm.put("Daisy", valueOf(99.22));
        hm.put("Qadir", valueOf(-19.08));

        Set set = hm.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {

            Map.Entry me = (Map.Entry)i.next();

            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());

        }

        System.out.println();

        double balance = ((Double)hm.get("Zara")).doubleValue();

        hm.put("Zara", valueOf(balance + 1000));
        System.out.println("Zara's new balance: " + hm.get("Zara"));

    }

}
