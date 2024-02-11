class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        this.brand = brand;
        this.price = price;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Hello {

    public static void main (String[] args) {

        var obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        var obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        // obj1.name = "Akwaa"; 

        obj1.show();
        obj2.show();
        

    }

}