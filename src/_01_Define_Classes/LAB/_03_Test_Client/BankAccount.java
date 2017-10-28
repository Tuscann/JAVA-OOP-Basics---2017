package _01_Define_Classes.LAB._03_Test_Client;

import java.text.DecimalFormat;

public class BankAccount {
    private int id;
    private double balance;


    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Account ID" + this.id + ", balance " + df.format(this.balance);
    }
}
