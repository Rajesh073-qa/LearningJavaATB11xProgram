package ex10_forLoop;

public class Lab110_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        // TO find the even numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even numbers from 1 to 50 ->" + i);
            } else {
                System.out.println("Odd numbers from 1 to 50  ->" + i);
            }

        }
    }
}
