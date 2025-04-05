package dailyTasks.Task024_inheritance;

public class single_inheritance {
    public static void main(String[] args) {
        child_class c = new child_class();
        c.father();
        c.mother();
        c.child1();
        c.child2();

    }
}

class parent_class {
    String father() {
        System.out.println("Father - 3bhk");
        return "";
    }

    void mother() {
        System.out.println("Mother - 2bhk");
    }
}

class child_class extends parent_class {
    void child1() {
        System.out.println("child -1");
    }

    void child2() {
        System.out.println("Child - 2");
    }
}
