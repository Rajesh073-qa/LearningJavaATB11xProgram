package dailyTasks;

public class Task025_Polymorphism {
    public static void main(String[] args) {
        method_overloading m = new method_overloading();
        m.same_name();
        m.same_name(2);
        m.same_name("");

        method_overriding3 n = new method_overriding3();
        n.same_name();

        method_overriding2 n2 = new method_overriding2();
        n2.same_name();

        method_overriding n3 = new method_overriding3();
        n3.same_name();
    }
}

class method_overloading {
    void same_name() {
        System.out.println("Method 1");
    }

    void same_name(int a) {
        System.out.println("Method 2");
    }

    void same_name(String a) {
        System.out.println("Method 3");
    }
}

class method_overriding {
    void same_name() {
        System.out.println("Method 4");
    }
}

class method_overriding2 extends method_overriding {
    @Override
    void same_name() {
        System.out.println("Method 5");
    }
}

class method_overriding3 extends method_overriding {
    @Override
    void same_name() {
        System.out.println("Method 6");
    }
}
