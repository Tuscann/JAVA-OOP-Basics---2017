package _01_Define_Classes.EXERCISES._07_Car_Salesman;

public class Engine {
    private String model;
    private Integer power;

    private Integer displacement;
    private String efficiency;

    public Engine(String model, Integer power) {
        this.setModel(model);
        this.setPower(power);
    }

    public Engine(String model, Integer power, Integer displacement) {
        this(model, power);
        this.setDisplacement(displacement);
    }

    public Engine(String model, Integer power, String efficiency) {
        this(model, power);
        this.setEfficiency(efficiency);
    }

    public Engine(String model, Integer power, Integer displacement, String efficiency) {
        this(model, power);
        this.setDisplacement(displacement);
        this.setEfficiency(efficiency);
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setPower(Integer power) {
        this.power = power;
    }

    private void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    private void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public Integer getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String displacementToPrint;

        if (this.getDisplacement() == null) {
            displacementToPrint = "n/a";
        } else {
            displacementToPrint = this.getDisplacement().toString();
        }
        String efficiency;
        if (this.getEfficiency() == null) {
            efficiency = "n/a";
        } else {
            efficiency = this.getEfficiency();
        }

        StringBuilder builder = new StringBuilder();
        builder.append("  " + this.getModel()).append(":").append("\n")
                .append("    Power: " + this.getPower() + "\n")
                .append("    Displacement: ").append(displacementToPrint).append("\n")
                .append("    Efficiency: ").append(efficiency);

        return builder.toString();
    }
}
