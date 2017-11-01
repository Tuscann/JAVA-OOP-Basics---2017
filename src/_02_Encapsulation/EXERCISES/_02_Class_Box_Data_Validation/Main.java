package _02_Encapsulation.EXERCISES._02_Class_Box_Data_Validation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);

        Double length = Double.parseDouble(scans.nextLine());
        Double width = Double.parseDouble(scans.nextLine());
        Double height = Double.parseDouble(scans.nextLine());

        Box box = null;

        try {
             box = new Box(length, width, height);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.printf("Surface Area - %.2f\n", box.getSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n", box.getLateralSurfaceArea());
        System.out.printf("Volume - %.2f\n", box.getVolume());
    }
}
