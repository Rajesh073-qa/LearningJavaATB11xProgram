package ex06_TernaryOperator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        String age1 = args[0];
        System.out.println(age1);
        System.out.println(age1 instanceof String);

        int age = Integer.parseInt(age1);


      String result = (age<=18) ? "minor" : (age<=65) ? "adult" : "senior" ;
        System.out.println(result);

    }}