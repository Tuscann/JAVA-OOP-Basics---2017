package _04_Polymorphism.EXERCISES._01_Vehicles;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] carArgs = scan.nextLine().split("\\s+");
        String vichileType = carArgs[0];
        Double fualQuantity = Double.parseDouble(carArgs[1]);
        Double litersPerKm = Double.parseDouble(carArgs[2]);
        Car car = new Car(fualQuantity, litersPerKm);

        String[] truckArgs = scan.nextLine().split("\\s+");
        vichileType = truckArgs[0];
        fualQuantity = Double.parseDouble(truckArgs[1]);
        litersPerKm = Double.parseDouble(truckArgs[2]);
        Truck truck = new Truck(fualQuantity, litersPerKm);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] currentRow = scan.nextLine().split("\\s+");
            String command = currentRow[0];
            String types = currentRow[1];
            Double argument = Double.parseDouble(currentRow[2]);

            try {
                switch (command) {
                    case "Drive":
                        if (types.equals("Car")) {
                            car.drive(argument);
                        } else if (types.equals("Truck")) {
                            truck.drive(argument);
                        }
                        DecimalFormat df = new DecimalFormat("0.##");
                        System.out.println(types + " travelled " + df.format(argument) + " km");
                        break;
                    case "Refuel":
                        if (types.equals("Car")) {
                            car.refuel(argument);
                        } else if (types.equals("Truck")) {
                            truck.refuel(argument);
                        }
                        break;                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(String.format("Car: %.2f", car.getFuelQuantity()));
        System.out.println(String.format("Truck: %.2f", truck.getFuelQuantity()));
    }
}
