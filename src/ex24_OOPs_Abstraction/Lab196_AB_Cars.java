package ex24_OOPs_Abstraction;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    }
}

abstract class Engine {
    abstract void StartEngine();

    abstract void StopEngine();

    void normal() {
        System.out.println("Normal function");
    }
}

class WagonR extends Engine {

    @Override
    void StartEngine() {
        System.out.println("Engine started");
    }

    @Override
    void StopEngine() {
        System.out.println("Engine stopped");

    }

    void drive() {
        StartEngine();
        StopEngine();
    }
}