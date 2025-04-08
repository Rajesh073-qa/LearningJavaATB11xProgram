package dailyTasks.Task027_for_if;

//Print even numbers from 1 to 20
public class Task7_while_even {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Even - " + i);
            }
            i++;
        }

    }
}
