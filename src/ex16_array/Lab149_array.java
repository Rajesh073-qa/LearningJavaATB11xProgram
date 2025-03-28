package ex16_array;

public class Lab149_array {
    public static void main(String[] args) {
        int marks[]={51,45,90,89,78,86};
        int mark[]=new int[3];
        mark[0]=35;
        mark[1]=67;
        mark[2]=34;
        String names[]={"rajesh", "vandana", "none"};
        double d[]={23.44,67.865 };
        for (int i = 0; i < mark.length; i++) {
            System.out.print(marks[i]);
            System.out.print(mark[i]);
            System.out.println(names[i]);


        }
    }
}
