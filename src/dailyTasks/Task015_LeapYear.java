package dailyTasks;

import java.util.Scanner;

public class Task015_LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year to find leap year or not");
        int year = s.nextInt();
        if (year % 400 == 0 ||( year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " - is a Leap year");
        } else {
            System.out.println(year + " - is not a Leap year");

        }
    }
}
