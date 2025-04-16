package ex32_Collection_Frameword_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab259_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);
        queue.add(12);
        queue.add(16);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
