package _01_Define_Classes.EXERCISES._04_Company_Roster;

public class Employee {
    private String name;
    private Double salary;
    private String position;
    private String department;
    private String email;
    private int age;


    public String getDepartment() {
        return department;
    }


    public Employee(String name, Double salary, String position, String department) {
        setName(name);
        setSalary(salary);
        setPosition(position);
        setDepartment(department);
        age = -1;
        email = "n/a";

    }

    public Employee(String name, Double salary, String position, String department, int age) {
        this(name, salary, position, department);
        setAge(age);
        email = "n/a";
    }

    public Employee(String name, Double salary, String position, String department, String email) {
        this(name, salary, position, department);
        setEmail(email);
        age = -1;
    }

    public Employee(String name, Double salary, String position, String department, String email, int age) {
        this(name, salary, position, department);
        setEmail(email);
        setAge(age);
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setSalary(Double salary) {
        this.salary = salary;
    }

    private void setPosition(String position) {
        this.position = position;
    }

    private void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {

        return String.format("%s %.2f %s %d", this.getName(), this.getSalary(), this.getEmail(), this.getAge());
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
