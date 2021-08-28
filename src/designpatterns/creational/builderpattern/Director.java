package designpatterns.creational.builderpattern;

public class Director {
    public void constructCrow(Builder builder) {
        builder.setColor(ColorEnum.BLACK);
        builder.setEyes(2);
        builder.setWings(2);
        builder.setLegs(2);
    }

    public void constructCockroach(Builder builder) {
        builder.setColor(ColorEnum.BROWN);
        builder.setEyes(4);
        builder.setWings(4);
        builder.setLegs(6);
        builder.setHorns(2);
    }

    public void constructDog(Builder builder) {
        builder.setColor(ColorEnum.WHITE);
        builder.setEyes(2);
        builder.setLegs(4);
    }
}
