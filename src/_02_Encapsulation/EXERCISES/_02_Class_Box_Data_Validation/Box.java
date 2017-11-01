package _02_Encapsulation.EXERCISES._02_Class_Box_Data_Validation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) throws Exception {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }
    private void setLength(double length) throws Exception {

        if (length > 0){
            this.length = length;
        }else {
            throw new Exception("Length cannot be zero or negative.");
        }
    }

    private void setWidth(double width) throws Exception {
        if (width > 0){
            this.width = width;;
        }else {
            throw new Exception("Width cannot be zero or negative.");
        }
    }

    private void setHeight(double height) throws Exception {

        if (height > 0){
            this.height = height;
        }else {
            throw new Exception("Height cannot be zero or negative.");
        }
    }

    private double getLength() {
        return length;
    }

    private double getWidth() {
        return width;
    }

    private double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.getHeight() * this.getLength() * this.getWidth();
    }

    public double getLateralSurfaceArea() {
        return (2 * this.getLength() * this.getHeight()) + (2 * this.getWidth() * this.getHeight());
    }

    public double getSurfaceArea() {
        return (2 * this.getLength() * this.getWidth()) +
                (2 * this.getLength() * this.getHeight()) +
                (2 * this.getWidth() * this.getHeight());
    }
}