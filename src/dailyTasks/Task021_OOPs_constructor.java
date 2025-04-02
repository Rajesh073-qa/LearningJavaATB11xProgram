package dailyTasks;

/*Create a Class with the Person - where we have DC, PC , two types.

        Fields. Instances - name, age, address, phone, isMale.

        Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.*/
public class Task021_OOPs_constructor {
    public static void main(String[] args) {
        person P1 = new person();
        System.out.println(P1.name);
        System.out.println(P1.age);
        System.out.println(P1.isMale);
        System.out.println(P1.address);
        System.out.println(P1.phone);
        P1.sleep();

        System.out.println("----------");
        person P2=new person("Rajesh C S",27, "Sharavathi Nagar",886729083);
        P2.eat();


        System.out.println("-----------");
        person P3=new person("Rajesh", 27, true);
        P3.doHome();

        System.out.println("----------");
        person P4=new person("Rajesh",27, 88823212, "Address",true);
    }
}

class person {
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;

    person() {
        name = "Rajesh";
        age = 27;
        address = "Sharavathi Nagar";
        phone = 886782079;
        boolean isMarried = false;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    void doHome() {
        System.out.println(this.name + " is Doing homework");
    }

    person(String a, int b, String c, long d) {
        this.name = a;
        this.age = b;
        this.address = c;
        this.phone = d;
    }

    person(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    person(String name, int age, long phone, String address, boolean isMale) {
        System.out.println("Name - " + name);
        System.out.println("Age - " + age);
        System.out.println("Address - " + address);
        System.out.println("Phone - " + phone);
        System.out.println("Is Male - " + isMale);

    }

}
