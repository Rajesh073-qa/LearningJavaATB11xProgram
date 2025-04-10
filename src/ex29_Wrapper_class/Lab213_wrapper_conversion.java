package ex29_Wrapper_class;

public class Lab213_wrapper_conversion {
    public static void main(String[] args) {
        int a = 87;
        Integer aa = a;
        System.out.println(aa.intValue());

        Integer b = 73;
        int bb = b;
        System.out.println(bb);

        int c = 10;
        Integer cc = c;  // This Boxing -> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue()); // Behav
        System.out.println(Integer.MIN_VALUE); // Behav

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
    }
}

