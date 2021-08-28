package designpatterns.creational.prototypepattern;

public abstract class Fruit {

    int amount;
    String color;

    public Fruit() {
    }

    public Fruit(Fruit fruit) {
        if (fruit != null) {
            this.amount = fruit.amount;
            this.color = fruit.color;
        }
    }

    public abstract Fruit clone();

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fruit other = (Fruit) obj;
        if (amount != other.amount)
            return false;
        if (color == null) {
            return other.color == null;
        } else
            return color.equals(other.color);
    }

}
