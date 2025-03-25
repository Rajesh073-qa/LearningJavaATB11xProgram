package ex14_Strings;

public class Lab145_stringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("RAJESH");
        stringBuffer.append(" C S");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());

        //Here it'll create 3 strings
        String str1="Hello";
        String str2=" World";
        String string=str1+str2;
        System.out.println(string);

    }
}
