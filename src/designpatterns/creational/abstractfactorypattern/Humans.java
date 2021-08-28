package designpatterns.creational.abstractfactorypattern;

import java.util.Scanner;

public class Humans {
    private static CharacterFactory characterFactory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a character: \n 1. Habib\n 2. Sharvari");
        int choice = sc.nextInt();
        sc.close();
        selectCharacter(choice);
        showCharacterDetails(characterFactory);
    }

    private static void showCharacterDetails(CharacterFactory factory) {
        Person person = factory.createPerson();
        Job job = factory.createJob();
        System.out.println("These are the details about the character.");
        person.sayName();
        person.sayHobby();
        job.sayJob();
    }

    private static void selectCharacter(int choice) {
        switch (choice) {
            case 1:
                characterFactory = new HabibCreator();
                break;

            default:
                characterFactory = new SharvariCreator();
                break;
        }
    }
}
