package _04_Polymorphism.EXERCISES._02_Vehicles_Extension;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String[] carArgs = scan.nextLine().split("\\s+");
            String vichileType = carArgs[0];
            Double fualQuantity = Double.parseDouble(carArgs[1]);
            Double litersPerKm = Double.parseDouble(carArgs[2]);
            Double tankCapasity = Double.parseDouble(carArgs[3]);
            Car car = new Car(fualQuantity, litersPerKm, tankCapasity);

            String[] truckArgs = scan.nextLine().split("\\s+");
            vichileType = truckArgs[0];
            fualQuantity = Double.parseDouble(truckArgs[1]);
            litersPerKm = Double.parseDouble(truckArgs[2]);
            tankCapasity = Double.parseDouble(carArgs[3]);
            Truck truck = new Truck(fualQuantity, litersPerKm, tankCapasity);

            String[] busArgs = scan.nextLine().split("\\s+");
            vichileType = busArgs[0];
            fualQuantity = Double.parseDouble(busArgs[1]);
            litersPerKm = Double.parseDouble(busArgs[2]);
            Bus bus = new Bus(fualQuantity, litersPerKm, litersPerKm);

            int n = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < n; i++) {
                String[] currentRow = scan.nextLine().split("\\s+");
                String command = currentRow[0];
                String types = currentRow[1];
                Double argument = Double.parseDouble(currentRow[2]);


                switch (command) {
                    case "Drive":
                        if (types.equals("Car")) {
                            car.drive(argument);
                        } else if (types.equals("Truck")) {
                            truck.drive(argument);
                        } else if (types.equals("Bus")) {
                            bus.drive(argument);
                        }
                        DecimalFormat df = new DecimalFormat("0.##");
                        System.out.println(types + " travelled " + df.format(argument) + " km");
                        break;
                    case "DriveEmpty":
                        if (types.equals("Bus")) {
                            car.drive(argument);
                        }
                        DecimalFormat dfs = new DecimalFormat("0.##");
                        System.out.println(types + " travelled " + dfs.format(argument) + " km");
                        break;
                    case "Refuel":
                        if (types.equals("Car")) {
                            car.refuel(argument);
                        } else if (types.equals("Truck")) {
                            truck.refuel(argument);
                        }
                        break;
                }
            }
            System.out.println(String.format("Car: %.2f", car.getFuelQuantity()));
            System.out.println(String.format("Truck: %.2f", truck.getFuelQuantity()));
            System.out.println(String.format("Truck: %.2f", bus.getFuelQuantity()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
