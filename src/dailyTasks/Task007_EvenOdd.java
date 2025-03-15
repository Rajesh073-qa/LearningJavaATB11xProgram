package dailyTasks;
//Take user input & Check weather the input is even or odd number

import java.util.Scanner;

public class Task007_EvenOdd {
    public static void main(String[] args) {

//        //type1
//        int number1 = Integer.parseInt(args[0]);
//       // int number2 = Integer.parseInt(args[1]);
//        String result = (number1%2==0) ? "Even number" : "Odd number";
//        System.out.println(result);

        //type2
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number :" );
        int number = s1.nextInt();
        if(number%2==0)
        {
            System.out.println("The given is even number");
        }
        else
        {
            System.out.println("The given is odd number");
        }


    }
}
