package _02_Encapsulation.EXERCISES._03_Animal_Farm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        Integer age = Integer.parseInt(scan.nextLine());

        Chicken chicken = null;
        try {
            chicken = new Chicken(age, name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.printf("Chicken %s (age %d) can produce %s eggs per day."
                , chicken.getName()
                ,chicken.getAge()
                ,chicken.productPerDay());

    }
}
