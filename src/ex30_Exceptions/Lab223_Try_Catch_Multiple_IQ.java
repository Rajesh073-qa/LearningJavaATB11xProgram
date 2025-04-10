package ex30_Exceptions;

public class Lab223_Try_Catch_Multiple_IQ {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            String s = null;
            s.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        /*this is not possible already bigger exception present above so we can't use individual exceptions below that
         catch (ArithmeticException e){
         System.out.println(e.getMessage());
        }*/
    }
}
