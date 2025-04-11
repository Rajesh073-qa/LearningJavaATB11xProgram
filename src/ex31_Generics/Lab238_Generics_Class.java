package ex31_Generics;

public class Lab238_Generics_Class {
    public static void main(String[] args) {
        GenericClass<Boolean> intRef = new GenericClass("Rajesh", 27, "ADress");
        intRef.getName();
    }
}

class GenericClass<D> {
    private D name;

    public D getName() {
        System.out.println(name);
        return name;
    }

    public void setName(D name) {
        this.name = name;
    }

    public D getAge() {
        return age;
    }

    public void setAge(D age) {
        this.age = age;
    }

    public D getAddress() {
        return address;
    }

    public void setAddress(D address) {
        this.address = address;
    }

    private D age;
    private D address;

    public GenericClass(D name, D age, D address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
