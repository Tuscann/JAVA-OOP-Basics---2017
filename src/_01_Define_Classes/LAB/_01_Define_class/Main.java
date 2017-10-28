package _01_Define_Classes.LAB._01_Define_class;

public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.id = 1;
        acc.balance = 345;

        System.out.printf("Acount ID%d, balanced %.2f",acc.id,acc.balance);


    }
}
