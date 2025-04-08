package dailyTasks.Task027_for_if;

//Calculate sum of first 10 natural numbers
public class Task9_sum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
