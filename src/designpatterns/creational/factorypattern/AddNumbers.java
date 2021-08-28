package designpatterns.creational.factorypattern;

public class AddNumbers extends MathOperation {
    @Override
    public Operation getOperation() {
        return new AdditionOperation();
    }
}
