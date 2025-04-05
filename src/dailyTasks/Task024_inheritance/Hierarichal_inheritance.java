package dailyTasks.Task024_inheritance;

public class Hierarichal_inheritance {
    public static void main(String[] args) {
        Child2 f = new Child2();
        f.home2();
        f.home();

        Child c = new Child();
        c.home2();
        c.home();

        mother m = new mother();
        m.home();
        m.home3();
    }
}

class father {
    void home() {
        System.out.println("Father - 5bhk");
    }
}

class mother extends father {
    void home3() {
        System.out.println("Mother - 4bhk");
    }
}

class Child extends father {
    void home2() {
        System.out.println("Son - Nothing!!");
    }
}

class Child2 extends father {
    void home2() {
        System.out.println("Son 2 - Nothing!!");
    }
}

