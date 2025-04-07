package ex24_OOPs_Abstraction;

public class Lab197_Abstraction_REAL {
    public static void main(String[] args) {
        C1 c = new C1();
        c.computePay();
        c.mailCheck();

    }
}

abstract class employee {
    private String name;
    private String address;
    private int number;

    employee() {
        System.out.println("default constructor");
    }

    employee(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
}

class C1 extends employee {

    @Override
    double computePay() {
        return 0;
    }
}
