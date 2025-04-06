package dailyTasks.Task026_if_else_program;

import java.util.Scanner;

public class Task9_LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year to check the leap year");
        int year = s.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap yearr!!!!!!hurray");
        } else {
            System.out.println("Not a Leap year!!!ufff");
        }

    }
}
