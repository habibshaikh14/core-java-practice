package designpatterns.creational.abstractfactorypattern;

public class Research implements Job {
    @Override
    public void sayJob() {
        System.out.println("I am going to do Masters.");
    }
}
