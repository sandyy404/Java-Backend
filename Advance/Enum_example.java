package Advance;

enum Laptop {
    mac(2000), XPS(2200), Surface, Hp(1500);
    private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.println("This is a constructor for those object that show price with name " +":"+ this.name());
    }

    private Laptop() {
        System.out.println("This is a default constructor for those object that do not show price with name " +": "+ this.name());
        price = 500;
    }

    public int getPrice() {
        return price;

    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Enum_example {

    public static void main(String[] args) {
        Laptop lp = Laptop.Hp;
        lp.setPrice(20000);
        Laptop[] lap = Laptop.values();
        for (Laptop e : lap) {
            System.out.println(e + ":" + e.getPrice());
        }
    }
}
