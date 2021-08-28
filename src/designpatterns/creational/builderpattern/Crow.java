package designpatterns.creational.builderpattern;

public class Crow {
    private final int numberOfLegs;
    private final int numberOfEyes;
    private final int numberOfWings;
    private final ColorEnum color;

    public Crow(int numberOfLegs, int numberOfEyes, int numberOfWings, ColorEnum color) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.numberOfWings = numberOfWings;
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public ColorEnum getColor() {
        return color;
    }

    public String getCrowString() {
        return "Crow [color=" + color + ", numberOfEyes=" + numberOfEyes + ", numberOfLegs=" + numberOfLegs
                + ", numberOfWings=" + numberOfWings + "]";
    }
}
