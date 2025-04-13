package dailyTasks.Task028_for_while;

public class Task09_Pyramid {
    public static void main(String[] args) {
        Integer rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}

