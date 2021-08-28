package designpatterns.creational.factorypattern;

public class SuntractNumbers extends MathOperation {
    @Override
    public Operation getOperation() {
        return new SubtractionOperation();
    }
}
