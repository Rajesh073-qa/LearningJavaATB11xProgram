package ex30_Exceptions;

public class Lab222_Try_catch_multiple {
    public static void main(String[] args) {
        try {
            int a = 12 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
