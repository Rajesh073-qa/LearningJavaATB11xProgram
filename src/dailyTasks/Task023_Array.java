package dailyTasks;

public class Task023_Array {
    public static void main(String[] args) {

        student stud[] = new student[2];
        stud[0] = new student("Rajesh", 902882, "A1");
        stud[1] = new student("Vandana", 1434545, "A2");
        for (student s : stud) {
            System.out.println(s);
        }
    }
}

class student {
    String name;
    int rollNumber;
    String batch;

    student(String name, int roll, String batch) {
        this.name = name;
        this.rollNumber = roll;
        this.batch = batch;
    }

    public String toString() {
        return "Name - " + name + "\nRoll number - " + rollNumber + "\nbatch - " + batch;
    }
}

