package designpatterns.creational.prototypepattern;

public class Orange extends Fruit {

    public Orange() {
    }

    public Orange(Orange orange) {
        super(orange);
    }

    @Override
    public Fruit clone() {
        return new Orange(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Orange) || !super.equals(obj))
            return false;
        Orange anotherOrange = (Orange) obj;
        return anotherOrange.color.equals(color) && anotherOrange.amount == amount;
    }
}
