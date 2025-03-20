package ex08_ifelse;

import java.util.Scanner;

public class Lab079if_else {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = s1.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
    }
}
