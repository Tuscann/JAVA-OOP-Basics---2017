package _01_Define_Classes.LAB._04_Define_Person;

import _01_Define_Classes.LAB._03_Test_Client.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String Name;
    private int Age;
    private List<BankAccount> accounts;

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
        this.accounts = new ArrayList<>();
    }

    public Person(String name, int age, List<BankAccount> accounts) {
        this.Name = name;
        this.Age = age;
        this.accounts = accounts;
    }

    public double getBalance() {

        return this.accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }


}
