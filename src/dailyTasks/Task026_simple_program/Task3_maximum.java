package dailyTasks.Task026_simple_program;

import java.util.Scanner;

//Find the Maximum of Two Numbers.
public class Task3_maximum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        int input = s.nextInt();
        System.out.println("Enter the second number");
        int input2=s.nextInt();
        if(input>input2){
            System.out.println("Maximum - "+input);
        }else{
            System.out.println("Maximum - "+input2);
        }
    }
}
