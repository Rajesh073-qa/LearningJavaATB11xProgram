package ex32_Collection_Frameword_DSA.LIST;

import java.util.*;

public class Lab249_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits1);

        List<String> fruits2 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("apple");
        fruits1.add("cherry");
        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List All_vegetables = new ArrayList();
        All_vegetables.add(fruits1);
        All_vegetables.add(fruits2);
        All_vegetables.add(vegatables);
        System.out.println(All_vegetables);


    }
}
