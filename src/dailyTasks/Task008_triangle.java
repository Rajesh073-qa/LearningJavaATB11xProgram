package dailyTasks;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths. Given three input values representing the
// lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles
// (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
public class Task008_triangle {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = s1.nextInt();
        System.out.println("Enter the side2");
        int side2 = s1.nextInt();
        System.out.println("Enter the side3");
        int side3 = s1.nextInt();

        //Edge cases
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("This ia not a triangle");
            System.exit(0);
        }
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("This is not a triangle");
            System.exit(0);
        }
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral triangle");
        }
        if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }


    }
}
