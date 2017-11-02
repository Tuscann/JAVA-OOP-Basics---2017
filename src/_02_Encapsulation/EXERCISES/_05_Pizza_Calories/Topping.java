package _02_Encapsulation.EXERCISES._05_Pizza_Calories;

public class Topping {
    private String type;
    private Double weight;

    public Topping(String type, Double weight) {
        this.setType(type);
        this.setWeight(weight);
    }

    private void setType(String type) {
        this.type = type;
    }

    private void setWeight(Double weight) {
        this.weight = weight;
    }
}
