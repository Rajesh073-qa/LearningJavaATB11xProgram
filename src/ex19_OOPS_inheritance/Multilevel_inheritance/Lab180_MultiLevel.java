package ex19_OOPS_inheritance.Multilevel_inheritance;

public class Lab180_MultiLevel {
    public static void main(String[] args) {
        GrandFather g1 = new GrandFather();
        g1.gf();
        System.out.println(g1.gold_gf);
        g1.home();
        System.out.println("----------");

        Father f1 = new Father();
        f1.f();
        System.out.println(f1.gold_gf);
        f1.home();
        f1.gf();
        System.out.println("-----------");

        Son s1 = new Son();
        s1.s();
        s1.home();
        s1.f();
        System.out.println(s1.gold_gf);


    }
}
