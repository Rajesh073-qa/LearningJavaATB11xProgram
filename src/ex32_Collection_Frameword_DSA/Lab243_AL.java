package ex32_Collection_Frameword_DSA;

import java.util.*;

public class Lab243_AL {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("CS"); // 0
        list.add("1"); // 0
        list.add("2");  // 1
        list.add("3"); // 2
        list.add("3");  //3
        list.add(4);  //4
        list.add(true);  //5
        list.add("3"); // 6

        list.add("1");
        list.add("Rajesh");
        list.add("1");
        list.add('a');

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        System.out.println(list.contains(1));
        System.out.println(list.contains("1"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

}

