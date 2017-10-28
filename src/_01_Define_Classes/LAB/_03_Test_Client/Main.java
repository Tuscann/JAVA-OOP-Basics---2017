package _01_Define_Classes.LAB._03_Test_Client;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();

            if ("End".equals(input)) {
                break;
            }
            String[] area = input.split("\\s+");

            String command = (area[0]);
            int id = Integer.parseInt(area[1]);
            switch (command) {
                case "Create":
                    createPerson(accounts, id);
                    break;
                case "Deposit":
                    addDepositMoney(accounts, id, area);
                    break;
                case "Withdraw":
                    getWithdraw(accounts, id, area);
                    break;
                case "Print":
                    if (accounts.containsKey(id)){
                        System.out.println(accounts.get(id).toString());
                    } else {
                        System.out.println("Account does not exist\n");
                    }
                    break;
            }
        }
    }

    private static void getWithdraw(HashMap<Integer, BankAccount> accounts, int id, String[] area) {
        if (accounts.containsKey(id)) {
            Double withdrawMoney = Double.parseDouble(area[2]);
            accounts.get(id);

            Double moneyInBank = accounts.get(id).getBalance();

            if (moneyInBank < withdrawMoney) {
                System.out.println("Insufficient balance");
            }
            else {
                accounts.get(id).withdraw(withdrawMoney);
            }

        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void addDepositMoney(HashMap<Integer, BankAccount> accounts, int id, String[] area) {
        if (accounts.containsKey(id)) {
            Double depositMoney = Double.parseDouble(area[2]);

            accounts.get(id).deposit(depositMoney);
        } else {
            System.out.println("Account does not exist");
        }
    }

    private static void createPerson(HashMap<Integer, BankAccount> accounts, int id) {

        if (accounts.containsKey(id)) {
            System.out.println("Account already exists");
        } else {
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
        }
    }
}
