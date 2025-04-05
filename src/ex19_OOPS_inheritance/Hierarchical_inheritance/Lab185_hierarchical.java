package ex19_OOPS_inheritance.Hierarchical_inheritance;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Rajesh r1 = new Rajesh();
        r1.r1();
        r1.home();

        kavya k1 = new kavya();
        k1.k1();
        k1.home();

        lohith l1 = new lohith();
        l1.l1();
        l1.home();

    }
}

class father {
    void home() {
        System.out.println("Father - 3bhk");
    }

}

class lohith extends father {
    void l1() {
        System.out.println("Son lohith - 2BHK");
    }
}

class kavya extends father {
    void k1() {
        System.out.println("Daughter - 4BHK");
    }
}

class Rajesh extends father {
    void r1() {
        System.out.println("Son - 5bhk");
    }
}