package dailyTasks;

public class Task019_Pyramid {
    public static void main(String[] args) {
        int rows = 5; // You can change this to print more/less rows

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
