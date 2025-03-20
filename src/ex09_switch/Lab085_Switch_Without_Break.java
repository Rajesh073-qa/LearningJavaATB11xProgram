package ex09_switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s1.nextInt();
        //All cases will be executed if we not use the break;
        switch (number) {
            case 1:
                System.out.println("Monday, Tuesday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday, Wednesday");
        }

    }
}
