package dailyTasks;

//Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.
public class Task006_maximum_ternary {
    public static void main(String[] args) {
        int First = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        String maximum_number = (First > second) ? "First is maximum" : "second is maximum";
        System.out.println(maximum_number);

    }
}
