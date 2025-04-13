package dailyTasks.Task028_for_while;

//inverted Right-Angled Triangle.
public class Task08_Left_angle_pyramid {
    public static void main(String[] args) {
        Integer input = 4;
        for (int i = input; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
