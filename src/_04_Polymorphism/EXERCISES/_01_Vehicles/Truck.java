package _04_Polymorphism.EXERCISES._01_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicles {
    private static final double AIR_CONDITIONER_CONSUMPTION = 1.6;

    public Truck(Double fualQuantity, Double litersPerKm) {
        super(fualQuantity, litersPerKm);
    }

    @Override
    public void drive(double kilometers) {
        DecimalFormat decimalFormat = new DecimalFormat("0.#########");
        double neededFuel = kilometers * (this.getFuelConsumption() + AIR_CONDITIONER_CONSUMPTION);
        if (neededFuel > super.getFuelQuantity()) {
            throw new IllegalArgumentException("Truck needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity() - neededFuel);
    }

    @Override
    public void refuel(double liters) {
        this.setFuelQuantity(this.getFuelQuantity() + liters * 0.95);
    }
}
