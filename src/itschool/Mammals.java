package itschool;

public class Mammals extends Animals {
    int milkPeriod;

    public Mammals(String title, int milkPeriod) {
        super(title);
        this.milkPeriod = milkPeriod;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" milk for " + milkPeriod + " months");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("by legs");
    }
}
