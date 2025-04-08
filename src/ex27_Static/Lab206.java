package ex27_Static;

public class Lab206 {
    public static void main(String[] args) {
        A $ = new A(45);
        $.displayValue();
        System.out.println(A.b);
        A.b = 1997;
        System.out.println(A.b);
        A $1 = new A(90);
        $1.displayValue();
        System.out.println(A.b);
    }
}

class A {
    int a;
    static int b = 20;

    A(int a) {
        this.a = a;
    }

    void displayValue() {
        System.out.println(this.a);
    }


}