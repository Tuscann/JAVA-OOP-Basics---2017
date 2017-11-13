package _04_Polymorphism.EXERCISES._03_Wild_farm;

import _04_Polymorphism.EXERCISES._03_Wild_farm.Animal.Animal;
import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Food;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String current = scan.nextLine();

            if (current.equals("End")) {
                break;
            }
            String[] animalArgs = current.split("\\s+");
            Animal animal = AnimalFactory.createAnimal(animalArgs);

            String[] foodArgs = scan.nextLine().split("\\s+");
            Food food = FoodFactory.createFood(foodArgs);

            animal.makeSound();
            try {
                animal.eat(food);
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
            System.out.println(animal);
        }
    }
}
