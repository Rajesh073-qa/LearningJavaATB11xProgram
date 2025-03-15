package dailyTasks;

import java.sql.SQLOutput;

public class Task005_Name_age_salary_CLE {
    public static void main(String[] args) {
        String name = args[0];
//        String age = args[1];
//        String salary = args[2];
        int Age = Integer.parseInt(args[1]);
        int Salary = Integer.parseInt(args[2]);
        System.out.println("Name :" + name);
        System.out.println("Age :" + Age);
        System.out.println("Salary :" + Salary);
    }
}
