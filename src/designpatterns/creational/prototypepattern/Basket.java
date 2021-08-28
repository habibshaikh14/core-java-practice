package designpatterns.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        List<Fruit> fruitsCopy = new ArrayList<>();

        createBasket(fruits);
        cloneAndCompare(fruits, fruitsCopy);
    }

    private static void createBasket(List<Fruit> fruits) {
        Apple apple = new Apple();
        apple.amount = 10;
        apple.color = "Red";
        fruits.add(apple);
        Apple anotherApple = (Apple) apple.clone();
        fruits.add(anotherApple);

        Banana banana = new Banana();
        banana.amount = 12;
        banana.color = "Yellow";
        fruits.add(banana);
        Banana anotherBanana = (Banana) banana.clone();
        fruits.add(anotherBanana);

        Orange orange = new Orange();
        orange.amount = 5;
        orange.color = "orange";
        fruits.add(orange);
        Orange anotherOrange = (Orange) orange.clone();
        fruits.add(anotherOrange);
    }

    private static void cloneAndCompare(List<Fruit> fruits, List<Fruit> fruitsCopy) {
        for (Fruit shape : fruits) {
            fruitsCopy.add(shape.clone());
        }

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i) != fruitsCopy.get(i)) {
                System.out.println(i + ": Fruits are different objects (yay!)");
                if (fruits.get(i).equals(fruitsCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
