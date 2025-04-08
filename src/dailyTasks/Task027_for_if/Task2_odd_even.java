package dailyTasks.Task027_for_if;
//Print even numbers from 1 to 20
public class Task2_odd_even {
    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i++) {
            if(i%2==0){
                System.out.println("Even - "+i);
            }else {
                System.out.println("Odd - "+i);
            }

        }
    }
}
