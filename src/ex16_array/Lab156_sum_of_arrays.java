package ex16_array;

public class Lab156_sum_of_arrays{
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10};
        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum=sum+numbers[i];
        {
        }
        System.out.println(sum);
        System.out.println("-----");
        System.out.println("For enhanced");
        for (int n :numbers){
            sum=sum+n;
        }
        System.out.println(sum);

    }
}
