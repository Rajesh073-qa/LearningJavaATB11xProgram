package ex09_switch;

// Web Automation
// I will ask the user to give me the input from browser which he wants to
// use to I will start the automation in that browser.

import java.util.Scanner;

public class Lab087_REAL_Switch {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = s1.next();
        switch (browser) {
            case "chrome":
                System.out.println("chrome browser will launch");
                break;
            case "firefox":
                System.out.println("firefox browser will launch");
                break;
            case "Edge":
                System.out.println("Edge browser will launch");
                break;
            default:
                System.out.println("No such browser found");

        }
    }
}
