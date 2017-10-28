package _01_Define_Classes.EXERCISES._01_Define_a_Class_Person;

import _01_Define_Classes.LAB._03_Test_Client.BankAccount;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class person = Person.class;
        Field[] filds = person.getDeclaredFields();
        System.out.println(filds.length);


//        Person ivan = new Person("Pesho",20);
//
//        System.out.println(ivan.getName());
//        System.out.println(ivan.getAge());



    }
}
