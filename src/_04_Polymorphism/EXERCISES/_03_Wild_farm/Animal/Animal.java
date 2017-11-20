package _04_Polymorphism.EXERCISES._03_Wild_farm.Animal;

import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Food;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private double animalWeight;
    private Integer foodEaten;

    public Animal(String animmalName, String animalType, double animalWeight, Integer foodEaten) {
        this.setAnimalName(animmalName);
        this.setAnimalType(animalType);
        this.setAnimalWeight(animalWeight);
        this.setFoodEaten(foodEaten);
    }

    private void setAnimalName(String animmalName) {
        this.animalName = animmalName;
    }

    private void setAnimalType(String animmalType) {
        this.animalType = animmalType;
    }

    private void setAnimalWeight(double animalWeight) {
        this.animalWeight = animalWeight;
    }

    protected void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Object getAnimalName() {
        return animalName;
    }

    public double getAnimalWeight() {
        return animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }
    public abstract void makeSound();
    public abstract void eat(Food food);
}
