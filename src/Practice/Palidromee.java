package Practice;

import java.util.Scanner;

public class Palidromee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = scan.next();
        String newInput = reversestring(input);
        if (newInput.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    private static String reversestring(String input) {
        String reserved="";
        for(int i=input.length()-1; i>=0; i--){
            reserved = reserved+input.charAt(i);
        }

        return reserved;
    }
}
