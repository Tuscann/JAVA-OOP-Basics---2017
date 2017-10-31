package _01_Define_Classes.EXERCISES._06_Raw_Data;

public class Engine {
    private int speed;
    private int power;

    Engine(int speed, int power){
        this.setSpeed(speed);
        this.setPower(power);
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    private void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }


}
