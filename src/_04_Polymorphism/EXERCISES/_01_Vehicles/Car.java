package _04_Polymorphism.EXERCISES._01_Vehicles;

public class Car extends Vehicles {
    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;

    protected Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
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
