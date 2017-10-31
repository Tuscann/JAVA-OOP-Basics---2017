package _01_Define_Classes.EXERCISES._06_Raw_Data;

public class Tyre {
    private double pressure;
    private int age;

    Tyre (double pressure, int age){
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return this.pressure;
    }

    public int getAge() {
        return this.age;
    }
}
