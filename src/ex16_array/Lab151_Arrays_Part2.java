package ex16_array;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String names[] = {"Rajesh", "vandana", "none"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("-------------");

        String name[] = new String[3];
        name[0]="Rajesh";
        name[1]="Vandana";
        name[2]="none";
        System.out.println(name.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}