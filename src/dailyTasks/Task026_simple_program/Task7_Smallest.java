package dailyTasks.Task026_simple_program;

import java.util.Scanner;

public class Task7_Smallest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first input");
        int num1 = s.nextInt();
        System.out.println("Enter the second input");
        int num2 = s.nextInt();
        if (num1 < num2) {
            System.out.println("The smallest number - " + num1);
        } else {
            System.out.println("The smallest number - " + num2);
        }
    }
}
