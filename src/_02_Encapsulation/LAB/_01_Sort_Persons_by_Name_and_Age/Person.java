package _02_Encapsulation.LAB._01_Sort_Persons_by_Name_and_Age;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName() + " is a " + this.getAge() + " years old.";
    }


}
