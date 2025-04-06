package dailyTasks.Task026_simple_program;

import java.util.Scanner;

// Check if a Triangle is Valid Based on Three Sides.
public class Task13_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = s.nextInt();
        System.out.println("Enter the side 2");
        int side2 = s.nextInt();
        System.out.println("Enter the side 3");
        int side3 = s.nextInt();
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("Given the input doesn't form a triangle");
        } else {
            System.out.println("Given input will form a triangle");
        }
    }
}