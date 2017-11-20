package _04_Polymorphism.EXERCISES._03_Wild_farm.Animal;

import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Food;

public class Felime extends Mammal {
    protected Felime(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }


    @Override
    public void makeSound() {

    }

    @Override
    public void eat(Food food) {

    }
}
