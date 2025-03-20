package ex09_switch;

import java.util.Scanner;

public class Lab084_switch {
    public static void main(String[] args) {
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int age = s1.nextInt();
        switch (age) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("No matching found");
                s1.close();

        }
    }
}
