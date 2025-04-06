package dailyTasks.Task026_if_else_program;

import java.util.Scanner;

// Check if a Person is Eligible to Vote (Age Check)
public class Task5_vote_eligibility {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int age = s.nextInt();
        if (age>=18){
            System.out.println("Eligible to vote!!");
        }else {
            System.out.println("Not eligible to vote!!");
        }
    }
}
