package Advance;

abstract class Car {

    public abstract void drive();

    public void playMusic() {
        System.out.println("Playing Music");
    }
}

class RR extends Car {

    public void drive() {
        System.out.println("Driving");
    }
}

public class aabstract {

    public static void main(String[] args) {
        Car dr = new RR();
        Car play = new RR();
        dr.drive();
        play.playMusic();
    }
}
