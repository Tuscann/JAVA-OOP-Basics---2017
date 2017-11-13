package monuments;

public class FireMonument extends Monument {

    private int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.fireAffinity = fireAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Fire Monument: %s, Fire Affinity: %d",
                super.getName(), this.fireAffinity);
    }

    @Override
    public int getPower() {
        return this.fireAffinity;
    }
}
