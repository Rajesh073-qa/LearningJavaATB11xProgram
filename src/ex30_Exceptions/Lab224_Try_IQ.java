package ex30_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        try {
            String s = null;
            s.trim();
            int a = 12 / 0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
