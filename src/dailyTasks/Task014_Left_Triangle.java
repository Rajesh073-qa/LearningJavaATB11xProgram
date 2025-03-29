package dailyTasks;

import java.util.Scanner;

public class Task014_Left_Triangle {
    public static void main(String[] args) {
        // ✅ Left Triangle Star Pattern
        //
        //*****
        //****
        //***
        //**
        //*
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = s.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
