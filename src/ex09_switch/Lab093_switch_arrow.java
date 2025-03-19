package ex09_switch;

public class Lab093_switch_arrow {
    public static void main(String[] args) {
        int itemCode =001;
        switch(itemCode){
            case 001 -> System.out.println("Mechanical");
            case 002 -> System.out.println("Electronic");
            case 003 -> System.out.println("Mobile");
            default -> System.out.println("No itemCode found");
        }
    }
}
