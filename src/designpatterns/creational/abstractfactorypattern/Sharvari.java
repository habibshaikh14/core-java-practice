package designpatterns.creational.abstractfactorypattern;

public class Sharvari implements Person {
    @Override
    public void sayName() {
        System.out.println("Hola my name is Sharvari!");
    }

    @Override
    public void sayHobby() {
        System.out.println("I like to watch romantic movies.");
    }
}
