package _02_Encapsulation.EXERCISES._03_Animal_Farm;

public class Chicken {
    private Integer age;
    private String name;

    public Chicken(Integer age, String name) throws Exception {
        this.setAge(age);
        this.setName(name);
    }

    private void setAge(Integer age) throws Exception {
        if (age >= 0 && age <= 15) {
            this.age = age;
        } else {
            throw new Exception("Age should be between 0 and 15.");
        }
    }

    public void setName(String name) throws Exception {
        if (name == null || name.trim().isEmpty()) {
            throw new Exception("Name cannot be empty.");
        }

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
    private String calculateProductPerDay() {
        String eggs = "";
        if (this.getAge() <= 5) {
            eggs = "2";
        } else if (this.getAge() >= 6 && this.getAge() <= 11) {
            eggs = "1";
        } else {
            eggs = "0.75";
        }
        return eggs;
    }

    public String productPerDay() {
       return this.calculateProductPerDay();
    }
}
