package designpatterns.creational.abstractfactorypattern;

public class Habib implements Person {
    @Override
    public void sayName() {
        System.out.println("Hi! I am Habib!");
    }

    @Override
    public void sayHobby() {
        System.out.println("I like to travel.");
    }
}
