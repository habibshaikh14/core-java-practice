package designpatterns.creational.factorypattern;

import java.util.Scanner;

public class Calculator {
    private static MathOperation mathOperation;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter a choice: \n 1. Addition\n 2. Subtraction");
        int choice = sc.nextInt();
        sc.close();
        initalizeMathOperations(choice);
        performCalculations(mathOperation, num1, num2);
    }

    private static void performCalculations(MathOperation operation, int num1, int num2) {
        operation.doCalculation(num1, num2);
    }

    private static void initalizeMathOperations(int choice) {
        switch (choice) {
            case 1:
                mathOperation = new AddNumbers();
                break;
            case 2:
                mathOperation = new SuntractNumbers();
        }
    }
}
