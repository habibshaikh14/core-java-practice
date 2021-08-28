package designpatterns.creational.builderpattern;

public class Cockroach {
    private final int numberOfLegs;
    private final int numberOfEyes;
    private final int numberOfHorns;
    private final int numberOfWings;
    private final ColorEnum color;

    public Cockroach(int numberOfLegs, int numberOfEyes, int numberOfHorns, int numberOfWings, ColorEnum color) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.numberOfHorns = numberOfHorns;
        this.numberOfWings = numberOfWings;
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public int getNumberOfHorns() {
        return numberOfHorns;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public ColorEnum getColor() {
        return color;
    }

    public String getCockroachString() {
        return "Cockroach [color=" + color + ", numberOfEyes=" + numberOfEyes + ", numberOfHorns=" + numberOfHorns
                + ", numberOfLegs=" + numberOfLegs + ", numberOfWings=" + numberOfWings + "]";
    }
}
