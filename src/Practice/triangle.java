package Practice;

import java.util.Scanner;

//Write a program that classifies a triangle based on its side lengths. Given three input values representing the
// lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles
// (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
public class triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = scan.nextInt();
        System.out.println("Enter the side 2");
        int side2 = scan.nextInt();
        System.out.println("Enter the side 3");
        int side3 = scan.nextInt();
        if (side1 == 0 || side2 == 0 || side3 == 0) {
            System.out.println("Not a triangle");
            System.exit(0);
        }
        if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2) {
            System.out.println("Not a triangle");
            System.exit(0);
        }
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("isosceles");
        } else {
            System.out.println("Scalene");
        }

    }

}


