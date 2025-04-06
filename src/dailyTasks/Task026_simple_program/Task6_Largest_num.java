package dailyTasks.Task026_simple_program;

import java.util.Scanner;

public class Task6_Largest_num {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first input");
        int num1 = s.nextInt();
        System.out.println("Enter the second input");
        int num2 = s.nextInt();
        System.out.println("Enter the third input");
        int num3 = s.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("The maximum number is - "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The maximum number is - "+num2);
        }else {
            System.out.println("The maximum number is - "+num3);
        }

    }
}
