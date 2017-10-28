package _01_Define_Classes.EXERCISES._02_Creating_Constructors;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "No name";
        this.age = 1;
    }

    public Person(int age) {
        this.name = "No name";
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
