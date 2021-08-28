package designpatterns.creational.builderpattern;

public interface Builder {
    void setLegs(int numberOfLegs);

    void setEyes(int numberOfEyes);

    void setHorns(int numberOfHorns);

    void setWings(int numberOfWings);

    void setColor(ColorEnum color);
}
