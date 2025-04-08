package ex25_OOPs_Abstraction_Interface;

public class Lab200_Multiple_Inheritance_Interface {
    public static void main(String[] args) {

    }
}

interface mother {
    void money();
}

interface father {
    void money();
}

class child implements father, mother {

    @Override
    public void money() {
        System.out.println("All the money is to child");
    }
}