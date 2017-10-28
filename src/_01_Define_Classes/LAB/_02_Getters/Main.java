package _01_Define_Classes.LAB._02_Getters;

public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.setId(1);
        acc.deposit(15);
        acc.withdraw(10);

        System.out.printf("Acount %s, balanced %.2f",acc,acc.getBalance());
    }
}
