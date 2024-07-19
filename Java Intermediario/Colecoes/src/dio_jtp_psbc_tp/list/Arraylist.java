/*
Exemplo do site javatpoint(jtp)
 */

package dio_jtp_psbc_tp.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<>();

        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

    }

}

