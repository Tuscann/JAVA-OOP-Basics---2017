package _04_Polymorphism.EXERCISES._02_Vehicles_Extension;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption, Double tankCapacity) {

        super(fuelQuantity, fuelConsumption,tankCapacity);
    }

    @Override
    protected void setFuelQuantity(double fuelQuantity) {
        if (super.getFuelQuantity() + fuelQuantity > super.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        super.setFuelQuantity(fuelQuantity);
    }
    @Override
    public void drive(double kms) {
        double neededFuel = (this.getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION) * kms;
        if (neededFuel > this.getFuelQuantity()) {
            throw new IllegalArgumentException("Car needs refueling");
        }
        this.setFuelQuantity(super.getFuelQuantity() - neededFuel);
    }

    @Override
    public void refuel(double liters) {
        this.setFuelQuantity(this.getFuelQuantity() + liters);
    }

}
