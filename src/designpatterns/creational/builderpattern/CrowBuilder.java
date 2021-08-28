package designpatterns.creational.builderpattern;

public class CrowBuilder implements Builder {
    private int numberOfLegs;
    private int numberOfEyes;
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
        System.out.println("Crow dosen't have horns.");
    }

    @Override
    public void setWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    @Override
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Crow getResult() {
        return new Crow(numberOfLegs, numberOfEyes, numberOfWings, color);
    }
}
