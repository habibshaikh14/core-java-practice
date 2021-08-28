package designpatterns.creational.singletonpattern;

public class God {
    private static God instance;

    private God() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException interruptedException) {
            Thread.yield();
            System.out.println("Yeild the thread");
        }
        System.out.println("I can be created only once");
    }

    public static God getInstance() {
        if (instance == null) {
            instance = new God();
        }
        return instance;
    }
}
