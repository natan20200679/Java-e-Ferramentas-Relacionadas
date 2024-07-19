/*
Exemplo do site javatpoint(jtp)
 */

package dio_jtp_psbc_tp.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

    public static void main(String args[]) {

        TreeSet<String> set = new TreeSet<>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());

        }

    }

}