package dailyTasks.Task028_for_while;

//Calculate the sum of numbers from 1 to 100
public class Task02_sum_numbers {
    public static void main(String[] args) {
        Integer sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Total sum of the numbers from 1 to 100 - " + sum);
    }
}
