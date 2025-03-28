package ex16_array;

import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input size");
        int size = sc.nextInt();
        String numbers_marks[] = new String[size];
        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println("Enter the numbers");
//            numbers_marks[i] = sc.nextFloat();
            numbers_marks[i] = sc.next();
        }

        System.out.println(" ---- ");

        for (int i = 0; i < numbers_marks.length; i++) {
            System.out.println(numbers_marks[i]);
        }

        sc.close();

    }
}