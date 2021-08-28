package designpatterns.creational.builderpattern;

public class DogBuilder implements Builder {
    private int numberOfLegs;
    private int numberOfEyes;
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
        System.out.println("Dog dosen't have horns.");
    }

    @Override
    public void setWings(int numberOfWings) {
        System.out.println("Dog dosen't have wings.");
    }

    @Override
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public Dog getResult() {
        return new Dog(numberOfLegs, numberOfEyes, color);
    }
}
