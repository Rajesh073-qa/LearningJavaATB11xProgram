package ex06_TernaryOperator;

public class Lab067_To_Three_Max {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20, n3 = 34;
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        System.out.println(max);
    }
}
