package ex23_OOPs_SUPER;

public class Lab193_super {
    public static void main(String[] args) {
        car c = new car();
        c.display();
    }
}

class vechicle {
    public int max_speed = 180;

    vechicle() {
        System.out.println("Default constructor");
    }

    vechicle(int a) {
        System.out.println("Parameterized constructor");
    }

    void message() {
        System.out.println("No any message");
    }

    void message(int a) {
        System.out.println("With parameterized");
    }

    void display() {
        System.out.println("Vehicle parent");
    }
}

class car extends vechicle {
    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void SetMax(int Speed) {
        this.maxSpeed = Speed;
    }

    car() {
        super(); //DC
    }

    car(int a) {
        super(10);
    }

    @Override
    void display() {
        super.message();
        super.message(12);
        super.display();
    }
}

