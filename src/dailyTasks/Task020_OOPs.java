package dailyTasks;

//Create a Class of a Person with A - 10, B - all 4 types of methods
// 1.Without Parameters and Without Return Type
// 2.Without_Parameters_but_With_Return_Type
// 3.With_Parameters_and_Without_Return_Type
// 4. With_Parameters_and_With_Return_Type
public class Task020_OOPs {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.sleep();
        p1.isMarrierd();
        p1.greet_with_details("Rajesh", 27, 789892.3);
        p1.Name("Rajesh");
    }
}

class Person1 {
    String name;
    String Ph_no;
    byte age;
    double weight;
    float height;
    int legs;
    double salary;
    String color_eyes;
    boolean isMale;
    boolean ismarried;

    void sleep() {
        System.out.println("Person is sleeping");
    }

    boolean isMarrierd() {
        boolean ismarried = true;
        return ismarried;
    }

    void greet_with_details(String name, int age, double salary) {

        System.out.println("Your name is = " + name + "\nYour age is = " + age + "\nYour salary = " + salary);
    }

    String Name(String name) {
        System.out.println("Your name is - "+name);
        return name;

    }

}

