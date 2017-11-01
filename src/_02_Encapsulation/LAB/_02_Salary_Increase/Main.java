package _02_Encapsulation.LAB._02_Salary_Increase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            Integer age = Integer.parseInt(input[2]);
            Double salary = Double.parseDouble(input[3]);

            Person person = new Person(firstName, lastName, age, salary);

            persons.add(person);
        }
        int bonus = Integer.parseInt(reader.readLine());

        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }
}
