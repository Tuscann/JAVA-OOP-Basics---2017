package _02_Encapsulation.EXERCISES._01_Class_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double length = Double.parseDouble(scan.nextLine());
        Double width = Double.parseDouble(scan.nextLine());
        Double height = Double.parseDouble(scan.nextLine());

        Box box = new Box(length, width, height);

        System.out.printf("Surface Area - %.2f\n", box.getSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n", box.getLateralSurfaceArea());
        System.out.printf("Volume - %.2f\n", box.getVolume());
    }
}
