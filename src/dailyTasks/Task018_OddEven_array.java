package dailyTasks;

public class Task018_OddEven_array {
    public static void main(String[] args) {
        int n[]={84,23,14,13,78,34};
        for (int i = 0; i < n.length; i++) {
            if (n[i]%2==0) {
                System.out.println("Even number "+n[i]);
            }
            else {
                System.out.println("Odd number "+n[i]);
            }

        }
    }
}
