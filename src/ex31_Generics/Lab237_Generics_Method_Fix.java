package ex31_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {
        tem_sum(45, 456);
        tem_sum(78.2, 88.00);
    }

    static <T> T tem_sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
