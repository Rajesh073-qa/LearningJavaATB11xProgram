package dailyTasks.Task028_for_while;

public class Task07_Right_angle_pyramid {
    public static void main(String[] args) {
        Integer input = 4;
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
