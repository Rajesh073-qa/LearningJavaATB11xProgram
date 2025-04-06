package dailyTasks.Task026_simple_program;

import java.util.Scanner;

//Check if a Number is Even or Odd.
public class Task2_odd_even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = s.nextInt();
        if (input % 2 == 0) {
            System.out.println("Even number - " + input);
        } else {
            System.out.println("odd number - " + input);
        }

    }
}
