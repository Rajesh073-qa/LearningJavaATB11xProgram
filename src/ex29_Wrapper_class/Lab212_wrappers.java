package ex29_Wrapper_class;

public class Lab212_wrappers {
    public static void main(String[] args) {
        ATB a = new ATB("Rajesh", 27);
    }
}

class ATB {
    String name;
    Integer age;
    Byte b;
    Short c;
    Double d;
    Float e;
    Character f;
    Boolean isMarried;

    ATB(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Name - " + name + "\nAge - " + age);
    }
}
