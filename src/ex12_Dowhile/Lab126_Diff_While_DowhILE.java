package ex12_Dowhile;

public class Lab126_Diff_While_DowhILE {
    public static void main(String[] args) {
        //while loop
        int a = 0;
        while (a < 0) {
            System.out.println(a);
            a++;
        }
        //do while loop
        do {
            System.out.println(a);
            a++;
        } while (a < 0);


    }
}
