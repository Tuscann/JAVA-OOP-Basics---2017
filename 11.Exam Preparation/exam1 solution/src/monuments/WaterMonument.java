package monuments;

public class WaterMonument extends Monument {

    private int waterAffinity;

    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Water Monument: %s, Water Affinity: %d",
                super.getName(), this.waterAffinity);
    }

    @Override
    public int getPower() {
        return this.waterAffinity;
    }
}
