package _01_Define_Classes.EXERCISES._03_Opiniol;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public String toString() {
        return this.name + " - " + this.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {

        if (age > 30) {
            this.age = age;
        }
    }
}
