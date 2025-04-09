package ex29_Wrapper_class;

public class Lab214_wrapper_conversion {
    public static void main(String[] args) {
        String num = "10";
        int aaa = 10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer b = Integer.parseInt(num);
        System.out.println(b);
        Integer bb = Integer.valueOf(num);
        System.out.println(bb);

        // String to Primitive
        int ss = Integer.parseInt(num);

        // Wrapper to String (toString method)
        System.out.println(bb.toString());

        // Primitive to String
        int age = 90;
        Integer dd = age;
        System.out.println(dd.toString());

    }
}