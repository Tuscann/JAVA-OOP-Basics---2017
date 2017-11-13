package benders;

public class EarthBender extends Bender {

    private double groundSaturation;

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.groundSaturation = groundSaturation;
    }

    @Override
    public String toString() {
        return String.format("###Earth Bender: %s, Power: %d, Ground Saturation: %.2f",
                super.getName(), super.getPower(), this.groundSaturation);
    }

    @Override
    public double getTotalPower() {
        return super.getPower() * this.groundSaturation;
    }
}
