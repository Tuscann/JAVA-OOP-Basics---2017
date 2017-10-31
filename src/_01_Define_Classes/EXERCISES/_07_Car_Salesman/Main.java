package _01_Define_Classes.EXERCISES._07_Car_Salesman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Engine> engineByModels = new HashMap<>();

        Integer enginesCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < enginesCount; i++) {
            String[] tokensEngine = scan.nextLine().split("\\s+");

            String model = tokensEngine[0];
            Integer power = Integer.parseInt(tokensEngine[1]);
            Engine engine = getEngine(tokensEngine, model, power);

            engineByModels.put(model, engine);
        }
        Integer carCount = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < carCount; i++) {
            String[] carArgs = scan.nextLine().split("\\s+");
            String carModel = carArgs[0];
            String engineModel = carArgs[1];
            Engine engine = engineByModels.get(engineModel);

            Car car = getCar(carArgs, carModel, engine);
            System.out.println(car);
        }

    }

    private static Car getCar(String[] carArgs, String carModel, Engine engine) {
        Car car = null;
        if (carArgs.length == 2) {
            car = new Car(carModel, engine);
        } else if (carArgs.length == 3) {
            try {
                Integer weight = Integer.parseInt(carArgs[2]);
                car = new Car(carModel, engine, weight);

            } catch (Exception e) {
                String color = carArgs[2];
                car = new Car(carModel, engine, color);
            }

        } else if (carArgs.length == 4) {
            Integer weight = Integer.parseInt(carArgs[2]);
            String color = carArgs[3];
            car = new Car(carModel, engine, weight, color);

        }
        return car;
    }

    private static Engine getEngine(String[] tokensEngine, String model, Integer power) {

        Engine engine = null;
        if (tokensEngine.length == 2) {
            engine = new Engine(model, power);
        } else if (tokensEngine.length == 3) {
            try {
                Integer displacements = Integer.parseInt(tokensEngine[2]);
                engine = new Engine(model, power, displacements);

            } catch (Exception e) {
                String efficiency = tokensEngine[2];
                engine = new Engine(model, power, efficiency);
            }

        } else if (tokensEngine.length == 4) {
            Integer displacements = Integer.parseInt(tokensEngine[2]);
            String efficiency = tokensEngine[3];
            engine = new Engine(model, power, displacements, efficiency);
        }
        return engine;
    }
}
