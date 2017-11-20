package _04_Polymorphism.EXERCISES._01_Vehicles;

public abstract class Vehicles {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicles(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    protected void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    protected void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void drive(double kms);

    public abstract void refuel(double liters);

    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }

        this.tankCapacity = tankCapacity;
    }

}
