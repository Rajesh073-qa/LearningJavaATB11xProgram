package dailyTasks;
// Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead
// of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."

import java.util.Scanner;

// (for loop, if else) ( i%3==0) → 3 , i%5==0 → 5
public class Task010_FizzBuzz_Test {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz " + number);
            } else if (number % 3 == 0) {
                System.out.println("Fizz " + number);
            } else if (number % 5 == 0) {
                System.out.println("Buzz " + number);
            } else {
                System.out.println(number);
            }

        }


    }
}
