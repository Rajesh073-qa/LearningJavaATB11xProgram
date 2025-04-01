package Practice;
//*Write a program that calculates and displays the letter grade for a given numerical score
//(e.g., A, B, C, D, or F) based on the following grading scale:
//
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59 */

import java.util.Scanner;


public class ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = scanner.nextInt();
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("Grade - "+ grade);
    }

}

