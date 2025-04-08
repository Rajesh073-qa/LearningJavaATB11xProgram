package ex25_OOPs_Abstraction_Interface;

public class Lab198 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.getArea(10, 20);
        Square s1 = new Square();
        s1.getArea(3, 4);
    }
}

interface polygon {
    void getArea(int length, int breadth);
}

class Square implements polygon {
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of the Square is " + 3.14 * length * breadth);
    }
}

class rectangle implements polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));


    }
}
