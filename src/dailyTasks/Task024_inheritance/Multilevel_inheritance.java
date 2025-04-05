package dailyTasks.Task024_inheritance;

public class Multilevel_inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.home();
        c.home2();
        c.home3();
    }
}

class Father {
    void home() {
        System.out.println("Father - 5bhk");
    }
}

class Mother extends Father {
    void home3() {
        System.out.println("Mother - 4bhk");
    }
}

class child extends Mother {
    void home2() {
        System.out.println("Son - Nothing!!");
    }
}

