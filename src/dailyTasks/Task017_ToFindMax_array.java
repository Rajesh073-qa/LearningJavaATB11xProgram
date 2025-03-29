package dailyTasks;

//Find Second-Largest Number in an Array in java without any function
public class Task017_ToFindMax_array {
    public static void main(String[] args) {
        int array[] = {23, 45, 56, 76, 90};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum number of the array \n" + max);

    }
}
