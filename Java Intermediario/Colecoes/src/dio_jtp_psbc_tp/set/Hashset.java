/*
Exemplo do site javatpoint(jtp)
 */

package dio_jtp_psbc_tp.set;

import java.util.*;

public class Hashset {

    public static void main(String args[]){

        HashSet<String> set = new HashSet<>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> itr = set.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

    }

}