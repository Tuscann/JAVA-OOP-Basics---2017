package _04_Polymorphism.LAB._02_Method_Overriding;

public class Square extends Rectangle {
    private double a;

    public Square(double a) {
        super(a);
    }
    @Override
    public double area() {
        return getA() * getA();
    }



}
