package ex32_Collection_Frameword_DSA.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Lab260_ARRAYDeque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(12);
        deck.push(16);
        deck.push(17);
        System.out.println(deck);

        Iterator iterator = deck.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
