package ex27_Static;

public class Lab208_Real {
    public static void main(String[] args) {
        ATB a = new ATB();
        a.setName("Rajesh C S");
        a.setPhone("8867820793");
        System.out.println("Name - " + a.getName());
        System.out.println("Phone no - " + a.getPhone());
        System.out.println("class - " + ATB.courseName);
        System.out.println("Mentor - " + ATB.MentorName);
        ATB.DoAssignement();
        ATB.ZoomClass();
    }
}

class ATB {
    static {
        System.out.println("Load the class?, I will execute");
    }

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose?
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
    }

    private String name;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String phone;
    static String courseName = "ATB11x";
    static String MentorName = "Pramod";

    static void DoAssignement() {
        System.out.println("All the student must complete the assignment");

    }

    static void ZoomClass() {
        System.out.println("All the student must attend the class in zoom");
    }

    void HowTheyDoAssignment() {
        System.out.println("All the students will do assignments differently");
    }
}