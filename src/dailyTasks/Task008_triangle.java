package dailyTasks;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths. Given three input values representing the
// lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles
// (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
public class Task008_triangle {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the l1");
        int l1 = s1.nextInt();
        System.out.println("Enter the l2");
        int l2 = s1.nextInt();
        System.out.println("Enter the l3");
        int l3 = s1.nextInt();
        if (l1 == l2 && l2 == l3) {
            System.out.println("equilateral (all sides are equal)");
        }
        if (l1 == l2 || l2 == l3 || l3 == l1) {
            System.out.println("isosceles (exactly two sides are equal)");
        } else {
            System.out.println("scalene (no sides are equal)");
        }
    }
}
