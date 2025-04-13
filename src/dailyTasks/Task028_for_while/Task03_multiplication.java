package dailyTasks.Task028_for_while;

import java.util.Scanner;

// Multiplication Table of a Given Number (take the input from user).
public class Task03_multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to have the multiplication - ");
        Integer input = s.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d*%d=%d\n", input, i, input * i);
        }
    }
}
