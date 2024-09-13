/*
Exemplo do site javatpoint(jtp)
 */

package jtp.deque;

import java.util.*;

public class Arraydeque {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");

        for (String str: deque) {

            System.out.println(str);

        }
    
    }

}