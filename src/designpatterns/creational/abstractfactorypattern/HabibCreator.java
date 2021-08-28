package designpatterns.creational.abstractfactorypattern;

public class HabibCreator implements CharacterFactory {
    @Override
    public Person createPerson() {
        return new Habib();
    }

    @Override
    public Job createJob() {
        return new Research();
    }
}
