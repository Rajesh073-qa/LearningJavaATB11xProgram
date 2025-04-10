package ex30_Exceptions;

public class Lab229_Jr_QA_VS_Sr_QA_3 {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
