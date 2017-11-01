package _02_Encapsulation.LAB._03_Validation_Data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            Integer age = Integer.parseInt(input[2]);
            Double salary = Double.parseDouble(input[3]);


            try{
                persons.add(new Person(firstName, lastName, age, salary));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
        int bonus = Integer.parseInt(reader.readLine());

        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
