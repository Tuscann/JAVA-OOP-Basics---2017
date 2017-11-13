import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        StringBuilder wars = new StringBuilder();
        int warCounter = 1;

        while (true) {
            String[] line = reader.readLine().split(" ");
            if(line[0].equals("Quit")) {
                break;
            }

            switch (line[0]) {
                case "Bender":
                    Factory.createBender(line[1], line[2], Integer.valueOf(line[3]),
                            Double.valueOf(line[4]));
                    break;
                case "Monument":
                    Factory.createMonument(line[1], line[2], Integer.valueOf(line[3]));
                    break;
                case "Status":
                    result.append(Controller.getStatus(line[1]));
                    break;
                case "War":
                    wars.append(String.format("War %d issued by %s%n", warCounter++, line[1]));
                    Controller.beginWar();
                    break;
                default:
                    break;
            }
        }

        System.out.print(result);
        System.out.println(wars);
    }
}
