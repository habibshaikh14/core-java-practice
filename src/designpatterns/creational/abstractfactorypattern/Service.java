package designpatterns.creational.abstractfactorypattern;

public class Service implements Job {
    @Override
    public void sayJob() {
        System.out.println("I am going to do UPSC");
    }
}
