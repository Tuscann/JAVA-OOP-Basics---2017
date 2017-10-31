package _01_Define_Classes.EXERCISES._07_Car_Salesman;

public class Car {
    private String model;
    private Engine engine;

    private Integer weight;
    private String color;

    public Car(String model, Engine engine) {
        this.setModel(model);
        this.setEngine(engine);
    }

    public Car(String model, Engine engine, Integer weight) {
        this(model, engine);
        this.setWeight(weight);
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.setColor(color);
    }

    public Car(String model, Engine engine, Integer weight, String color) {
        this(model, engine);
        this.setWeight(weight);
        this.setColor(color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String weightToPrint;

        if (this.getWeight() == null) {
            weightToPrint = "n/a";
        } else {
            weightToPrint = this.getWeight().toString();
        }
        String Color;
        if (this.getColor() == null) {
            Color = "n/a";
        } else {
            Color = this.getColor();
        }
        StringBuilder sb = new StringBuilder("");
        sb.append(this.getModel() + ":\n");
        sb.append(this.getEngine() + "\n");
        sb.append("  Weight: " + weightToPrint + "\n");
        sb.append("  Color: " + Color);

        return sb.toString();
    }
}
