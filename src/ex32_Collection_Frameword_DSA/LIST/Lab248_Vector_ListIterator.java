package ex32_Collection_Frameword_DSA.LIST;

import java.util.*;

public class Lab248_Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Item1");
        vector.add("Item2");
        vector.add("Item3");
        vector.add("Item4");
        vector.add("Item5");

        ListIterator listIterator = vector.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println(" -- ");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
