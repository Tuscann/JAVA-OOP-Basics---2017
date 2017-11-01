package _02_Encapsulation.EXERCISES._04_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Double money;
    private List<Product> products;

    public Person(String name, Double money) throws Exception {
        this.products = new ArrayList<>();

        this.setName(name);
        this.setMoney(money);
    }

    private void setName(String name) throws Exception {
        if (name == null || name.trim().length() == 0) {
            throw new Exception("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(Double money) throws Exception {
        if (money < 0) {
            throw new Exception("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean canPurchase(Product product) {
        return this.getMoney() >= product.getCost();
    }

    public void purchase(Product product) throws Exception {
        this.setMoney(this.getMoney() - product.getCost());
        this.products.add(product);
    }
}
