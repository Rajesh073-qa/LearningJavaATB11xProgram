package ex20_OOPs_Polymorphism.Method_Overloading;

public class calculator {
    int attribute;

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        calculator c1=new calculator();
        System.out.println("sum - "+c1.add( 23,43));
        System.out.println(c1.add(45.3,79.2));
    }


}
