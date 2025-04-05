package dailyTasks;

public class Task022_OOPs_Encapsulation {
    public static void main(String[] args) {
        ATB a = new ATB();
        a.student("Rajesh", 27);
        System.out.println(a.getName() + " " + a.getAge());
    }
}

class ATB {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    void student(String a, int b) {
        this.name = a;
        this.age = b;
        System.out.println("first method");
    }
}
