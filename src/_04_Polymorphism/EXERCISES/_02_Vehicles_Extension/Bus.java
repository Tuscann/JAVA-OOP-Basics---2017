package _04_Polymorphism.EXERCISES._02_Vehicles_Extension;

public class Bus extends Vehicle {

    protected Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public void drive(double kilometers) {
        Double consumption = kilometers * (this.getFuelConsumption());
        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity() - consumption);
    }

    @Override
    public void refuel(double liters) {

    }
}
