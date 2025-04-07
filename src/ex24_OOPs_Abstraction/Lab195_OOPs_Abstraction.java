package ex24_OOPs_Abstraction;

public class Lab195_OOPs_Abstraction {
    public static void main(String[] args) {
        Child c = new Child();
        c.loan_50k();
        c.loan25k();

    }
}

abstract class father {
    abstract void loan_50k();

    void loan25k() {
        System.out.println("Given 25K");
    }
}

class Child extends father {

    @Override
    void loan_50k() {
        System.out.println("ex24_OOPs_Abstraction.Child will pay the loan!");

    }
}
