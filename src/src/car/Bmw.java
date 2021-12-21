package car;

public class Bmw extends Car {
    public Bmw() {
        super("black", 2015);
        System.out.println("in Bmw's constructor");
    }

    public void run() {
        System.out.println("The Bmw is run");
    }
}
