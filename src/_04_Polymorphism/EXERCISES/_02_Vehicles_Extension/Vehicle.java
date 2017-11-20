package _04_Polymorphism.EXERCISES._02_Vehicles_Extension;

public abstract class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setFuelConsumption(fuelConsumption);
        this.setFuelQuantity(fuelQuantity);
        this.setTankCapacity(tankCapacity);
    }

    public void setTankCapacity(double tankCapacity) {
        if (tankCapacity <= 0) {
            System.out.println("Fuel must be a positive number");
        }

        this.tankCapacity = tankCapacity;
    }

    public double getTankCapacity() {
        return this.tankCapacity;
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
}
