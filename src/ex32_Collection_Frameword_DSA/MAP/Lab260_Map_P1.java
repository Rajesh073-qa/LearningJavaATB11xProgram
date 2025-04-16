package ex32_Collection_Frameword_DSA.MAP;

import java.util.HashMap;
import java.util.*;

public class Lab260_Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key and value pair
        // name -> rajesh c s
        m1.put("Name", "Rajesh C S");
        m1.put("Age", 27);
        m1.put("Phone number", 886782079);
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        //output - {Name=Vandana, Age=25, Phone number=886782075}
        m2.put("Name", "Vandana");
        m2.put("Age", 25);
        m2.put("Phone number", 886782075);
        System.out.println(m2);

        Map m3 = new TreeMap();
        //order naturally
        //output - {Age=24, Name=Sweety, Phone number=886782071}
        m3.put("Name", "Sweety");
        m3.put("Age", 24);
        m3.put("Phone number", 886782071);
        System.out.println(m3);
    }
}
