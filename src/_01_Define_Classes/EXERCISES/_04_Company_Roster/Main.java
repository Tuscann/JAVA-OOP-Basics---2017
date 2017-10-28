package _01_Define_Classes.EXERCISES._04_Company_Roster;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static LinkedHashMap<String, LinkedList<Employee>> employeesByDepartmen = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < count; i++) {
            String[] input = scan.nextLine().split("\\s+");
            createEmployee(input);
        }
        employeesByDepartmen.entrySet().stream()
                .sorted((d1, d2) -> Double.compare(
                        (d2.getValue().stream().mapToDouble(Employee::getSalary).sum() / d2.getValue().size()),
                        (d1.getValue().stream().mapToDouble(Employee::getSalary).sum() / d1.getValue().size())))
                .limit(1)
                .forEach(d -> {
                    System.out.println("Highest Average Salary: " + d.getKey());

                    d.getValue().stream()
                            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                            .forEach(System.out::println);
                });
    }

    private static void createEmployee(String[] input) {
        String name = input[0];
        Double salary = Double.parseDouble(input[1]);
        String position = input[2];
        String department = input[3];
        String email = "n/a";
        Integer age = -1;

        if (input.length == 5) {
            if (input[4].contains("@")) {
                email = input[4];
            } else {
                age = Integer.parseInt(input[4]);
            }
        }
        if (input.length == 6) {
            email = input[4];
            age = Integer.parseInt(input[5]);
        }
        Employee em = new Employee(name, salary, position, department,email,age);

        if (!employeesByDepartmen.containsKey(em.getDepartment())){
            employeesByDepartmen.put(em.getDepartment(), new LinkedList<>());
        }
        employeesByDepartmen.get(em.getDepartment()).add(em);
    }
}
