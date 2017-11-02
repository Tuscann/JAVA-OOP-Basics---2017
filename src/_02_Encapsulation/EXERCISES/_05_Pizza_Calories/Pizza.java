package _02_Encapsulation.EXERCISES._05_Pizza_Calories;

public class Pizza {
    private String name;
    private Double dough;
    private Integer toppings;

    public Pizza(String pizzaName, Integer numbersOfToppings) {
        this.setName(pizzaName);
        this.setToppings(numbersOfToppings);
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setToppings(Integer toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getName()+" - ";
    }
}
