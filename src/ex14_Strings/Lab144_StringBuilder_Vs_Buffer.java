package ex14_Strings;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        //90% we use string only
        String str1 = "Rajesh";
        String str2 = new String("RAJESH");
        System.out.println(str1);
        System.out.println(str2);

        //10% - very rare we use StringBuilder & StringBuffer
        StringBuilder Builder = new StringBuilder("Rajesh");
        System.out.println(Builder);

        StringBuffer buffer = new StringBuffer("RAJESH");
        System.out.println(buffer);


    }
}
