package designpatterns.creational.factorypattern;

public class AdditionOperation implements Operation {
    @Override
    public void performOperation(int num1, int num2) {
        System.out.println("Performing Addition Operation and the result is: " + (num1 + num2));
    }

    @Override
    public void displayOperation() {
        System.out.println("Addition operation: num1 + num2 = result");
    }
}
