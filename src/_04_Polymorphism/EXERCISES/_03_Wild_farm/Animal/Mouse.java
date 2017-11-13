package _04_Polymorphism.EXERCISES._03_Wild_farm.Animal;

import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Food;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (!"Vegetable".equals(food.getClass().getSimpleName())) {
            throw new IllegalArgumentException("Mouses are not eating that type of food!");
        }

        super.setFoodEaten(super.getFoodEaten() + food.getQuantity());
    }
}
