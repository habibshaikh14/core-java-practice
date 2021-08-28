package designpatterns.creational.factorypattern;

public abstract class MathOperation {
    public void doCalculation(int num1, int num2) {
        Operation operation = getOperation();
        operation.displayOperation();
        operation.performOperation(num1, num2);
    }

    public abstract Operation getOperation();
}
