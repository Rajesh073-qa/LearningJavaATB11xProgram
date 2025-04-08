package ex25_OOPs_Abstraction_Interface;

public class Lab199_Interface {
    public static void main(String[] args) {
        car c = new car();
        c.startEngine();
        c.applyBreak();
        c.stopEngine();
    }
}

interface Brakes {
    void applyBreak();
}

interface Engine1 {
    void startEngine();

    void stopEngine();

    default void test() {
        System.out.println("concrete complete");
    }
}

class car implements Engine1, Brakes {

    @Override
    public void applyBreak() {
        System.out.println("Apply Break");

    }

    @Override
    public void startEngine() {
        System.out.println("Start engine");

    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");

    }
}