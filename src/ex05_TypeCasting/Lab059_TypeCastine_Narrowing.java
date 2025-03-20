package ex05_TypeCasting;

public class Lab059_TypeCastine_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Invalid - Narrowing - Implicit Casting is not allowed.
        byte b2 = (byte) val; // Valid - Narrowing - Explicit Casting - Allowed.
        // Data Loss.
        System.out.println(b2);
        int a = 9023;
        short b = (short) a;
        System.out.println(b);
    }
}
