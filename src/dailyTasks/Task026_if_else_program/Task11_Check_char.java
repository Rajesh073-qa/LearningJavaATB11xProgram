package dailyTasks.Task026_if_else_program;

import java.util.Scanner;

//Check if a Character is an Alphabet.
public class Task11_Check_char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = s.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("The given character is the Alphabet!!!!!Ayeee nice - " + ch);
        } else {
            System.out.println("Sorry!!! The given character is not a Alphabet - " + ch);
        }

    }

}
