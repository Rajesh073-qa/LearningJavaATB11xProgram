package ex30_Exceptions;

public class Lab221_Try_Catch {
    public static void main(String[] args) {
        System.out.println("first");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("I AM A GENTLE MAN");
        }
        System.out.println("Second");
    }
}
