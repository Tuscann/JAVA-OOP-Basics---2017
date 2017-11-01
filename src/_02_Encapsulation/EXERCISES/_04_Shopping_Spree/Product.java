package _02_Encapsulation.EXERCISES._04_Shopping_Spree;

public class Product {
    private String name;
    private Double cost;

    public Product(String name, Double cost) throws Exception {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) throws Exception {
        if (name == null || name.trim().length() == 0) {
            throw new Exception("Name cannot be empty");
        }

        this.name = name;
    }

    private void setCost(Double cost) throws Exception {
        if (cost < 0) {
            throw new Exception("Money cannot be negative");
        }

        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
