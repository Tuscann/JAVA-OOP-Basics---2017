package _02_Encapsulation.EXERCISES._04_Shopping_Spree;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        List<String> personsList = new LinkedList<>();

        String[] inputs = scan.nextLine().split(";");
        for (int j = 0; j < inputs.length; j++) {
            String[] current = inputs[j].split("=");

            String name = current[0];
            Double money = Double.parseDouble(current[1]);

            Person person = new Person(name, money);

            personsList.add(name);
        }
        String[] products = scan.nextLine().split(";");

        for (int j = 0; j < products.length; j++) {
            String[] currents = inputs[j].split("=");

            String name = currents[0];
            Double cost = Double.parseDouble(currents[1]);

            Product product = new Product(name, cost);
        }

        while (true) {
            String curent = scan.nextLine();
            if (curent.equals("END")) {
                break;
            }
            String[] tokens = curent.split("\\s");
            String personName = tokens[0];
            String productname = tokens[1];

            try {
                if (personsList.contains(personName)){
                    System.out.printf("%s",personName);
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }


    }
}
