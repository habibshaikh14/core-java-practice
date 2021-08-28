package designpatterns.creational.prototypepattern;

public class Banana extends Fruit {

    public Banana() {
    }

    public Banana(Banana banana) {
        super(banana);
    }

    @Override
    public Fruit clone() {
        return new Banana(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Banana) || !super.equals(obj))
            return false;
        Banana anotherBanana = (Banana) obj;
        return anotherBanana.color.equals(color) && anotherBanana.amount == amount;
    }
}
