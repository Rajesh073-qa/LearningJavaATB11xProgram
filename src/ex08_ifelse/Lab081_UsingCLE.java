package ex08_ifelse;

public class Lab081_UsingCLE {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>=18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
