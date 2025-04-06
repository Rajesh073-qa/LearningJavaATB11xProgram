package dailyTasks.Task026_simple_program;

import java.util.Scanner;

// Check if a Number is Positive or Negative.
public class Task1_Positive_negative {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = s.nextInt();
        if (input >= 0) {
            System.out.println("The given number is the positive - " + input);
        } else {
            System.out.println("The given number is the negative - " + input);
        }
    }
}
