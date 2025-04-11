package ex31_Generics;

public class Lab236_generic {
    public static void main(String[] args) {
        temp_sum(45, 456);
        temp_sum(78.2, 88.00);
    }

    static int temp_sum(int a, int b) {
        return a + b;
    }

    static double temp_sum(double a, double b) {
        return a + b;
    }
}
