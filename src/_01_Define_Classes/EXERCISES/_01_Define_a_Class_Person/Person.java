package _01_Define_Classes.EXERCISES._01_Define_a_Class_Person;

import _01_Define_Classes.LAB._03_Test_Client.BankAccount;

import java.util.List;

public class Person {
    private String name;   // поле name , field
    private int age;
    private List<BankAccount> accounts;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.accounts = accounts;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
