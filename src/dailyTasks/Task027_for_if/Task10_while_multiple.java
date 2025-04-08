package dailyTasks.Task027_for_if;
// Print the multiplication table of 7
public class Task10_while_multiple {
    public static void main(String[] args) {
        int i = 1, n = 7;
        while (i <= 10) {
            System.out.printf("%d*%d=%d\n", n, i, n * i);
            i++;
        }
    }
}
