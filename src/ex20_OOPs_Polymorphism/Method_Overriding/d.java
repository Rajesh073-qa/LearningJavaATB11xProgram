package ex20_OOPs_Polymorphism.Method_Overriding;

public class d {
    public static void main(String[] args) {
        FireFox f = new FireFox();
        f.openBrowser();

        chromeTC c = new chromeTC();
        c.openBrowser();
        c.openBrowser();

        CommonToAll c1 = new CommonToAll();
        c1.openBrowser();

    }

}

class CommonToAll {
    void openBrowser() {
        System.out.println("IE browser opened");
    }
}

class chromeTC extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Chrome browser opened");

    }

    int openBrowser(int a) {
        return a;
    }
}

class FireFox extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("firefox browser opened");

    }
}