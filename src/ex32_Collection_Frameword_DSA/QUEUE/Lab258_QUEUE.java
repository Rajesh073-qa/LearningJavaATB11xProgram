package ex32_Collection_Frameword_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab258_QUEUE {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue queue=new PriorityQueue();
        queue.add("Rajesh");
        queue.add("C S");
        // PQ -> Natural - Sorting
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
