package ex23_OOPs_SUPER;

public class Lab194_superKeyword {
    public static void main(String[] args) {
        dog d = new dog();
        d.display();
    }

}

class GOD {
    void sound() {
        System.out.println("Ohh GOD!!!!");
    }
}

class animal extends GOD {
    protected String color = "white";

    void sound() {
        System.out.println("Animal sound");
        super.sound();
    }
}

class dog extends animal {
    private String color = "Black";

    dog() {
        System.out.println("Default constructor");
    }

    void display() {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
    }
}