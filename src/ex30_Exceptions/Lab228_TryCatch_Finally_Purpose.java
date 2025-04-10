package ex30_Exceptions;

import java.util.Scanner;

public class Lab228_TryCatch_Finally_Purpose {
    public static void main(String[] args) {
        Scanner s = null;
        int input = s.nextInt();
        try {
            int a = input / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
            System.out.println("Scanner class is closed!!");
        }
    }
}
