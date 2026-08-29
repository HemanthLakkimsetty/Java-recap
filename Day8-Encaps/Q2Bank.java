package Encaps;

import java.util.Scanner;

public class Q2Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankMng bm = new BankMng();

        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();
                    bm.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();
                    bm.withdraw(withdraw);
                    break;

                case 3:
                    bm.currBal();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

class BankMng {
    private double bal;

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getBal() {
        return bal;
    }

    public void withdraw(int amt) {
        if (amt <= 0 || amt > getBal()) {
            System.out.println("Error: Invalid amount entered");
        } else {
            double a = getBal();
            setBal(a - amt);
            System.out.println("Withdrawn successfully: " + amt);
            System.out.println("Current balance: " + getBal());
        }
    }

    public void deposit(int amt) {
        if (amt <= 0) {
            System.out.println("Error: Invalid amount entered");
        } else {
            double a = getBal();
            setBal(a + amt);
            System.out.println("Deposited successfully: " + amt);
            System.out.println("Current balance: " + getBal());
        }
    }

    public void currBal() {
        System.out.println("Current Balance: " + getBal());
    }
}