package _02_Encapsulation.EXERCISES._05_Pizza_Calories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       try{
           String[] pizzaArgs = scan.nextLine().split("\\s");

           String pizzaName = pizzaArgs[1];
           Integer numbersOfToppings = Integer.parseInt(pizzaArgs[2]);

           Pizza pizza = new Pizza(pizzaName, numbersOfToppings);


           String[] doughTokens = scan.nextLine().split("\\s");

           String flourType = doughTokens[1];
           String bakingTechnique = doughTokens[2];
           Double weightInGrams = Double.parseDouble(doughTokens[3]);

           Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);

           for (int i = 0; i < numbersOfToppings; i++) {
               String[] toppingTokens = scan.nextLine().split("\\s");

               String toppingType = toppingTokens[1];
               Double toppingWeightInGrams = Double.parseDouble(toppingTokens[2]);

               Topping topping = new Topping(toppingType, toppingWeightInGrams);

               pizza.addTopping(topping);
           }
           System.out.println(pizza);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
