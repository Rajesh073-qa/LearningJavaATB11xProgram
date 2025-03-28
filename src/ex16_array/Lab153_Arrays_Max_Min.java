package ex16_array;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Can we take the input from user also? = Yes - later
        // Max and Min
        int max = give_me_max(array);
        int min = give_me_min(array);
        System.out.println(max);
        System.out.println(min);


    }

    private static int give_me_min(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;

    }

    private static int give_me_max(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
}