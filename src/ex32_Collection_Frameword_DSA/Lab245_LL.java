package ex32_Collection_Frameword_DSA;

import java.util.ArrayList;
import java.util.List;

public class Lab245_LL {
    public static void main(String[] args) {
        List<String> animals = new ArrayList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Tiger");

        //Accessing elements
        System.out.println("First element: " + animals.getFirst());
        System.out.println("Last element: " + animals.getLast());

        //Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal: " + animals);
        System.out.println("Size of LinkedList: " + animals.size());
    }
}
