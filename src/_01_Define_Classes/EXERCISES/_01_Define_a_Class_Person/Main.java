package _01_Define_Classes.EXERCISES._01_Define_a_Class_Person;

import java.lang.reflect.Field;


public class Main {
    public static void main(String[] args) {
        Class person = Person.class;
        Field[] filds = person.getDeclaredFields();
        System.out.println(filds.length);
    }
}
