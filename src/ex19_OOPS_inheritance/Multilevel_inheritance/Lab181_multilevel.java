package ex19_OOPS_inheritance.Multilevel_inheritance;

public class Lab181_multilevel {
    public static void main(String[] args) {
        //Son s1 = new GrandFather();
        //Son s1 = new Father();

        Son amit = new Son();
        amit.s();

        GrandFather g1 = new Son();
        g1.home();

        Father f1 = new Son();
        f1.home();
        // Father f3 = new GrandFather();
        // WebDriver driver = new ChromeDriver();
    }
}
