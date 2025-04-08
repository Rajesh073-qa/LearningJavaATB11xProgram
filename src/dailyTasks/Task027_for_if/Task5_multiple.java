package dailyTasks.Task027_for_if;

//Print the multiplication table of 5
public class Task5_multiple {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d*%d=%d\n", n, i, n * i);
        }
    }
}
