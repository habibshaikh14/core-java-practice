package designpatterns.creational.builderpattern;

import java.util.Scanner;

public class CreateAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an animal type: \n 1. Crow\n 2. Cockroach\n 3. Dog");
        int choice = sc.nextInt();
        sc.close();
        buildAnimal(choice);
    }

    private static void buildAnimal(int choice) {
        Director director = new Director();
        switch (choice) {
            case 1:
                CrowBuilder crowBuilder = new CrowBuilder();
                director.constructCrow(crowBuilder);
                Crow crow = crowBuilder.getResult();
                System.out.println(crow.getCrowString());
                break;
            case 2:
                CockroachBuilder cockroachBuilder = new CockroachBuilder();
                director.constructCockroach(cockroachBuilder);
                Cockroach cockroach = cockroachBuilder.getResult();
                System.out.println(cockroach.getCockroachString());
                break;
            case 3:
                DogBuilder dogBuilder = new DogBuilder();
                director.constructDog(dogBuilder);
                Dog dog = dogBuilder.getResult();
                System.out.println(dog.getDogString());
                break;
            default:
                System.out.println("Please choose correct option.");
                break;
        }
    }
}
