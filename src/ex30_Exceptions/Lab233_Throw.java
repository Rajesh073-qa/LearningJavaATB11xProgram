package ex30_Exceptions;

public class Lab233_Throw{
    public static void main(String[] args) {

    }
    static void divisibleByZero(int a){
        if(a==0){
            throw new ArithmeticException();
        }
    }
}
