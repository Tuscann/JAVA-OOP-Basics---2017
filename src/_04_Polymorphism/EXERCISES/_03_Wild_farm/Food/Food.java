package _04_Polymorphism.EXERCISES._03_Wild_farm.Food;

public abstract class Food  {
    private Integer quantity;

    public Food(Integer quantity) {
        this.setQuantity(quantity);
    }

    private void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
