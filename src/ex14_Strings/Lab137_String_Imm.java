package ex14_Strings;

public class Lab137_String_Imm {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat(" world"); // concat add the values , merge the values
        System.out.println(s1);

        String str3 = "String";
        str3=str3.concat(" function");
        System.out.println(str3);
        String str4=str3.concat(" function");
        System.out.println(str4);

    }
}