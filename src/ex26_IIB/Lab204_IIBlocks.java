package ex26_IIB;

public class Lab204_IIBlocks {
    public static void main(String[] args) {
        vechicle v = new vechicle();
        vechicle v2 = new vechicle(2);
        vechicle v3 = new vechicle();
    }
}

class vechicle {
    vechicle() {
        System.out.println("Default constructor");
    }

    vechicle(int a) {
        System.out.println("Parameterized constructor");
    }

    {
        System.out.println("Instance initialization block - 1");
    }

    {
        System.out.println("Instance initialization block - 2");
    }

    {
        System.out.println("Instance initialization block - 3");
    }

}
