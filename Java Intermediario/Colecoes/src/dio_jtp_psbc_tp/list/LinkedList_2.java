/*
Exemplo do site javatpoint(jtp)
 */

package dio_jtp_psbc_tp.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_2 {

    public static void main(String args[]){

        LinkedList<String> al = new LinkedList<>();

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());

        }

    }

}
