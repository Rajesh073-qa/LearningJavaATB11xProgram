package dailyTasks;

import java.util.Scanner;

public class Task012_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the work to check the palindrome or not");
        String input = scanner.next();
        String newString = reverseString(input);
        if (newString.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");

        }
    }

    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        return reversed;
    }

    private static String reverseStringSB(String input) {
        StringBuilder builder = new StringBuilder(input);
        builder.reverse();
        return builder.toString();

    }
}