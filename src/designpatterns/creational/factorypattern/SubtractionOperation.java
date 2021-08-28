package designpatterns.creational.factorypattern;

public class SubtractionOperation implements Operation {
    @Override
    public void performOperation(int num1, int num2) {
        System.out.println("Performing subtraction Operation and the result is: " + (num1 - num2));
    }

    @Override
    public void displayOperation() {
        System.out.println("Subtration Operation: num1 - num2 = result");
    }
}
