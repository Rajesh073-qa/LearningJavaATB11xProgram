package ex20_OOPs_Polymorphism.Method_Overriding;

public class Lab189_MOverriding {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound();
        Animal a1=new Animal();
        a1.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}