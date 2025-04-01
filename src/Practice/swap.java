package Practice;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=scan.nextInt();
        System.out.println("Enter the value of b");
        int b= scan.nextInt();
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
    }
}
