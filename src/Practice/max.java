package Practice;

import java.util.Scanner;

//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
public class max {
    public static void main(String[] args) {
        //cle
//        int input1 = Integer.parseInt(args[0]);
//        int input2 = Integer.parseInt(args[1]);
        //scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first input");
        int _1input = scan.nextInt();
        System.out.println("Enter the second input");
        int _2input = scan.nextInt();

        String maximum = (_1input == _2input) ? "Both numbers are equal" : (_1input > _2input) ? "first is maximum" : "Second is maximum";
        System.out.println(maximum);


    }
}