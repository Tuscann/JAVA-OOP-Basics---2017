package _01_Define_Classes.EXERCISES._03_Opiniol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = Integer.parseInt(scan.nextLine());
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < counter; i++) {
            String[] currrnet = scan.nextLine().split("\\s+");

            String name = currrnet[0];
            Integer age = Integer.parseInt(currrnet[1]);

            Person newPerson = new Person(name,age);

            persons.add(newPerson);

        }
        persons.stream().filter(p -> p.getAge() > 30).sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }
}
