package dailyTasks.Task026_if_else_program;

import java.util.Scanner;

//ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
//       Steps to Write the Program
//1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//2️⃣ Take user input for the amount they want to withdraw.
//3️⃣ Check withdrawal conditions:
//The amount should be greater than zero.
//The amount should be a multiple of 100 (common ATM rule).
//The amount should not exceed the account balance.
//4️⃣ Deduct the amount from the balance if conditions are met.
//5️⃣ Display the updated balance or an error message if the withdrawal fails.
public class Task12_ATM {
    static int fixed_amount = 10000;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int amount = s.nextInt();
        if (amount <= 0) {
            System.out.println("Amount should be greater than zero");
        } else if (amount % 100 != 0) {
            System.out.println("Amount should be multiple of 100");
        } else if (amount > fixed_amount) {
            System.out.println("Amount should not exceed the account balance");
        } else {
            int balance = fixed_amount - amount;
            System.out.println("Balance amount is " + balance);
        }

    }
}
