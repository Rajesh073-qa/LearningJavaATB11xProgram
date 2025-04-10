package ex30_Exceptions;

public class Lab227_Try_Catch_Finally {
    public static void main(String[] args) {
        try {
            int a = 90 / 0;
            String s = null;
            s.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executed anyway");
        }
    }
}
