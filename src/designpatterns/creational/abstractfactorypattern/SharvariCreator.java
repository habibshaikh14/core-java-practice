package designpatterns.creational.abstractfactorypattern;

public class SharvariCreator implements CharacterFactory {
    @Override
    public Person createPerson() {
        return new Sharvari();
    }

    @Override
    public Job createJob() {
        return new Service();
    }
}
