package designpatterns.creational.singletonpattern;

public class CreateGod {
    public static void main(String[] args) {
        God god1 = God.getInstance();
        God god2 = God.getInstance();

        if (god1 == god2) {
            System.out.println("There is only one GOD");
        } else {
            System.out.println("There are multiple GODs FUCK!!!");
        }
    }
}
