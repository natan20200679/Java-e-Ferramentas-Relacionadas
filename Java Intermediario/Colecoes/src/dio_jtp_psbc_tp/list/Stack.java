/*
Exemplo do site javatpoint(jtp)
 */

package dio_jtp_psbc_tp.list;

import java.util.*;

// Aqui defini a classe com "1" no final para a instanciação na linha 13 ficar... 
// mais enxuta (Uso do termo "Stack" ao invés do termo "java.util.Stack")
public class Stack { 
    
    public static void main(String args[]) {

        java.util.Stack<String> stack = new java.util.Stack<>();

        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();

        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

    }

}
