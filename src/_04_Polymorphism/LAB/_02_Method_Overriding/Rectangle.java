package _04_Polymorphism.LAB._02_Method_Overriding;

public class Rectangle {

    private double a;
    private double b;
    public Rectangle(double a) {
        this.setA(a);
    }


    public Rectangle(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double area() {
        return getA() * getB();
    }
}
