package ex32_Collection_Frameword_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab241_LIST_I {
    public static void main(String[] args) {
        List fruits = List.of("Banana", "Orange", "Apple", "chicku", 12, 'r', 34.1, true);
//        fruits.add("chickuu");
//        fruits.remove(12);

        List l = new ArrayList(); // Dynamic Diapatch
        ArrayList l2 = new ArrayList();
        l.add("hello");
        l.add(123);
        l.add(true);
        l.add("Blah Blah");
    }
}
