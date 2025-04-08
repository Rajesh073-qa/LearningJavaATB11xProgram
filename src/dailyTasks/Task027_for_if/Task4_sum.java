package dailyTasks.Task027_for_if;

// Print the sum of first 10 natural numbers
public class Task4_sum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("total of sum = " + sum);
    }
}
