package benders;

public class AirBender extends Bender {

    private double aerialIntegrity;

    public AirBender(String name, int power, double aerialIntegrity ) {
        super(name, power);
        this.aerialIntegrity = aerialIntegrity;
    }

    @Override
    public String toString() {
        return String.format("###Air Bender: %s, Power: %d, Aerial Integrity: %.2f",
                super.getName(), super.getPower(), this.aerialIntegrity);
    }

    @Override
    public double getTotalPower() {
        return super.getPower() * this.aerialIntegrity;
    }
}
