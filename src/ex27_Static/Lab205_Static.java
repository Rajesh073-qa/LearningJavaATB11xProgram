package ex27_Static;

public class Lab205_Static {
    public static void main(String[] args) {
        f1 c = new f1();
        f1 c1 = new f1();

    }
}

class f1 {
    {
        System.out.println("Instance initialization block -1");
    }

    f1() {
        System.out.println("Default constructor");
    }

    static {
        System.out.println("static method 1");
    }
}
