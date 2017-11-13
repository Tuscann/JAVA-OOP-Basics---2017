package _04_Polymorphism.EXERCISES._03_Wild_farm;

import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Food;
import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Meat;
import _04_Polymorphism.EXERCISES._03_Wild_farm.Food.Vegetable;

public class FoodFactory {
    public static Food createFood(String[] foodArgs) {
        String foodType = foodArgs[0];
        int foodQuantity = Integer.parseInt(foodArgs[1]);

        if ("Meat".equals(foodType)) {
            return new Meat(foodQuantity);
        } else if ("Vegetable".equals(foodType)) {
            return new Vegetable(foodQuantity);
        } else {
            return null;
        }
    }
}
