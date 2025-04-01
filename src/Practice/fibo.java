package Practice;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the fibonocci number");
        int input = scan.nextInt();
        int series = fiboo(input);

    }

    private static int fiboo(int input) {
        int first = 0, second = 1;
        System.out.print(first + " " + second+ " ");
        for (int i = 2; i <= input; i++) {
            int next = first + second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
        return input;
    }
}
