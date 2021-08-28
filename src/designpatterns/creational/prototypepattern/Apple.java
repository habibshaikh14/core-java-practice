package designpatterns.creational.prototypepattern;

public class Apple extends Fruit {

    public Apple() {
    }

    public Apple(Apple apple) {
        super(apple);
    }

    @Override
    public Fruit clone() {
        return new Apple(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Apple) || !super.equals(obj))
            return false;
        Apple anotherApple = (Apple) obj;
        return anotherApple.color.equals(color) && anotherApple.amount == amount;
    }
}
