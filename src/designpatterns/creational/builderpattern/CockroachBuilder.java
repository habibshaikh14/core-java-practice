package designpatterns.creational.builderpattern;

public class CockroachBuilder implements Builder {
    private int numberOfLegs;
    private int numberOfEyes;
    private int numberOfHorns;
    private int numberOfWings;
    private ColorEnum color;

    @Override
    public void setLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void setEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    @Override
    public void setHorns(int numberOfHorns) {
        this.numberOfHorns = numberOfHorns;
    }

    @Override
    public void setWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Cockroach getResult() {
        return new Cockroach(numberOfLegs, numberOfEyes, numberOfHorns, numberOfWings, color);
    }
}
