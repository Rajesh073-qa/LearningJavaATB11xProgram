package dailyTasks;

import java.util.Scanner;

/*The **Fibonacci Sequence** is a series of numbers where each number is the sum of the two preceding ones, starting from **0 and 1**.

### Formula:
 F(n)=F(n−1)+F(n−2)
where:
- F(0)=0
- F(1)=1
### Example of the Sequence:
 0,1,1,2,3,5,8,13,21,34,55,89,…

Each number is found by adding the **previous two numbers** in the sequence:

- 0+1=1
- 1+1=2
- 1+2=3
- 2+3=5
- 3+5=8
- and so on...*/
public class Task009_Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the user
        System.out.println("Welcome to the Fibonacci Program\nEnter the no whose Fibonacci series you want!"); // Prompt the user for input
        int num = scanner.nextInt();
        int series = Fibonacci(num);
        if (num < 1) {
            System.out.println("Please enter a positive number.");
        } else if (num == 1) {
            System.out.println("0");
        }
    }

    private static int Fibonacci(int num) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;

        }
        return num;
    }
}