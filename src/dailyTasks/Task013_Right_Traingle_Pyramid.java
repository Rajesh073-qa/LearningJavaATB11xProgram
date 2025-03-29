package dailyTasks;

import java.util.Scanner;

public class Task013_Right_Traingle_Pyramid {
    public static void main(String[] args) {
        // ✅ Right Triangle Star Pattern - Arrays
        //*
        //**
        //***
        //****
        //*****
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the size for eg.n=3");
        int size = s1.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }

    }
}
