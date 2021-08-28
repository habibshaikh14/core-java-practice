package designpatterns.creational.builderpattern;

public class Dog {
    private final int numberOfLegs;
    private final int numberOfEyes;
    private final ColorEnum color;

    public Dog(int numberOfLegs, int numberOfEyes, ColorEnum color) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public ColorEnum getColor() {
        return color;
    }

    public String getDogString() {
        return "Dog [color=" + color + ", numberOfEyes=" + numberOfEyes + ", numberOfLegs=" + numberOfLegs + "]";
    }
}
