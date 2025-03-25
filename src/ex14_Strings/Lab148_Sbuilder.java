package ex14_Strings;

public class Lab148_Sbuilder {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("HELLO ");
        builder.append("WORLD");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.replace(0,4,"JAVA");
        System.out.println(builder);
    }
}
