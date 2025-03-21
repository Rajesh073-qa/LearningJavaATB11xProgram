package ex13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        // call
        //  int result = rajesh_f1();
        int result = return_int();
        System.out.println(result);

        boolean r = return_boolean();
        System.out.println(r);

        float v = return_float_pi_value();
        System.out.println(v);
    }

    static void rajesh_f1() {
        System.out.println("No Return");
        //no return when there is a void
    }

    static int return_int() {
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }

    static byte return_byte() {
        return 100;
    }

    static long return_long() {
        return 10l;
    }

    static String return_String() {
        return "Rajesh";
    }


}
