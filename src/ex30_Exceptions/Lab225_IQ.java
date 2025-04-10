package ex30_Exceptions;

public class  Lab225_IQ {
    public static void main(String[] args) {
        try {
            String input_user = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(input_user); // java.lang.NumberFormatException: For input string
            int output = 100 / a;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}