package ex27_Static;

public class Lab207_static {
    public static void main(String[] args) {
        B.CommonToall();
        System.out.println(B.b);
        B ref = new B();
        ref.display();

    }
}

class B {
    static {
        System.out.println("static method");
    }

    int a = 10;
    static int b = 20;

    void display() {
        System.out.println(b);
        System.out.println("Non static function");
    }

    static void CommonToall() {
        // System.out.println(a); - this is not possible as we're using static method, so static method can use static instance variable
//System.out.println(a);
        System.out.println("Static function");
    }

//static class{ - static class is not useful

}



