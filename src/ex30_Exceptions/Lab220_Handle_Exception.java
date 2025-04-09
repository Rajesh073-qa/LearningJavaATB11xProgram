package ex30_Exceptions;

public class Lab220_Handle_Exception {
    public static void main(String[] args) {
        int a =45;
        try {
            a=a/0;
        } catch (Exception e) {
            System.out.println("Something went wrong!!!!!");
        }
    double b=53;
    try{
        b=b/0;
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}
}