package ex29_Wrapper_class;

public class Lab215_wrapper {
    public static void main(String[] args) {
        Mobile iPhone = new Mobile("iPhone", 8955565, 750000.00);
        Mobile Samsung = new Mobile("Samsung", 88155, 100000.00);
        System.out.println(iPhone);
        System.out.println(Samsung);
        System.out.println(Mobile.mobile_carrier);
        Mobile.SwitchOnAirplaneMode();

    }
}

class Mobile extends OldPhone {
    private Integer phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    private String name;
    private Double price;
    static String mobile_carrier = "airtel";

    //Default constructor
    Mobile() {
        System.out.println("Default constructor");
    }

    //parameterized constructor
    Mobile(String name, Integer phone, Double price) {
        this.name = name;
        this.phone = phone;
        this.price = price;
    }

    void display() {
        System.out.println(this.name + this.price + this.phone);
    }

    static void SwitchOnAirplaneMode() {
        System.out.println("Airplane mode");
    }

    void priceChange(Integer price) {
        System.out.println("Changed price");
    }

    void priceChange(Double price) {
        System.out.println("Doubled the price");
    }

    void calling() {
        System.out.println("dialpad ->touch dialpad now!!");
    }
}

class OldPhone implements SIMCard {
    void calling() {
        System.out.println("dialpad");
    }

    public void enterCard() {
        System.out.println("Card entered");
    }
}

interface SIMCard {
    void enterCard();
}

