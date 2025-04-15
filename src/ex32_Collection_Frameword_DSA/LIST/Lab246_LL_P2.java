package ex32_Collection_Frameword_DSA.LIST;

import java.util.*;

public class Lab246_LL_P2 {
    public static void main(String[] args) {
        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous

        List mylist2=new LinkedList(); //Doubly link so don't have the indexing concept
        mylist2.add("Rajesh");
        mylist2.add("C S");
        mylist2.add("Vandu");
        mylist2.add("Pallu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("C S"));
        System.out.println(mylist2.indexOf("C S"));


    }
}
