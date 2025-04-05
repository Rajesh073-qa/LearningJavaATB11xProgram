package ex20_OOPs_Polymorphism.Method_Overloading;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {
        home h1 = new home();
        h1.task(23);
        h1.task(23, 43);
        h1.task(45, 65.3f, 456.34, "Rajesh");

    }
}

class home {
    void task(int a) {
        System.out.println("Task 1");
    }

    void task(int a, int b) {
        System.out.println("Task 2");
    }

    void task(int a, float b, double c, String s) {
        System.out.println("Task 3");
    }
}
