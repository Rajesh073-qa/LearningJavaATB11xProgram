package ex11_while;
//to find the factorial of given number
/*The **factorial** of a number n, denoted as **n!**, is the product of all positive integers from **1 to n**.

        ### Formula:
n!=n×(n−1)×(n−2)×...×2×1

        ### Examples:
        - 5!=5×4×3×2×1=120
        - 4!=4×3×2×1=24
        - 3!=3×2×1=6
        ### Special Cases:
        - 1!=1
        - 0!=1 (by definition)
Factorials are commonly used in **combinations, permutations, and probability calculations** in
mathematics and computer science. 🚀*/

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        // Factorial Program
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Welcome to the Factorial Program\nEnter the no whose factorial you want!"); // Prompt the user for input
        int number = scanner.nextInt(); // Read an integer input from the user

        int factorial = 1; // Initialize the factorial variable to 1
        if (number <= 0) { // Check if the number is less than or equal to 0
            System.out.println(factorial); // If true, print the factorial (which is 1)
        } else {
            // If the number is greater than 0, calculate the factorial
            for (int i = 1; i <= number; i++) { // Loop from 1 to the number
                factorial = factorial * i; // Multiply the current factorial value by i
            }
        }

        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial
    }
}