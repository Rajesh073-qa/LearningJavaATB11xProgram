package ex30_Exceptions;

import java.util.Scanner;

public class Lab230_IQ {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try {
            int x = 10 / a;
        } catch (Exception e) {
            System.out.println("Div by zero");
        }finally {
            System.out.println("I'll be executed");
        }
    }

    public static class Lab234_Throw {
        public static void main(String[] args) throws Exception {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = s.nextInt();
            try {
                ValidateAge(age);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private static void ValidateAge(int age) throws Exception {
            if (age < 18) {
                throw new Exception("You're not eligible to vote");
            }
        }
    }
}
