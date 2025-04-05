package ex21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        VWO_log v1 = new VWO_log();

        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("Rajesh", "978899RD##");
        System.out.println(goodVWOLogin.getUsername());
        String a = goodVWOLogin.getPassword();
        System.out.println(a);

        goodVWOLogin.setUsername("RAJESH C S");
        System.out.println(goodVWOLogin.getUsername());
        goodVWOLogin.setPassword("8868754455");
        System.out.println(goodVWOLogin.getPassword());

    }

}

class VWO_log {
    public String username;
    public String password;

    String VWO_login(String a, String b) {
        this.username = a;
        this.password = b;
        return a+b;
    }
}

class GoodVWOLogin {

    private String username; // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
