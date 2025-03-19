package ex09_switch;

import java.util.Scanner;

public class Lab086_switch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the character");
        int a = s1.nextInt();
        switch(a){
            case 1:
                System.out.println("case 1");
            case 2:
                System.out.println(a);

        }

    }
}
