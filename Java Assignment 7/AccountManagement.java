//Java Program to Create Account with 500 Rs Minimum Balance, Deposit Amount...

import java.util.Scanner;

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    private int balance;

    public Account() {
        this.balance = 500; // Minimum balance
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (amount > balance) {
            throw new LessBalanceException("Withdraw amount (" + amount + " Rs) is not valid. Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
    }

    public int getBalance() {
        return balance;
    }
}

public class AccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create two accounts
        Account account1 = new Account();
        Account account2 = new Account();

        // Deposit money into both accounts
        System.out.print("Enter deposit amount for Account 1: ");
        int depositAmount1 = scanner.nextInt();
        account1.deposit(depositAmount1);

        System.out.print("Enter deposit amount for Account 2: ");
        int depositAmount2 = scanner.nextInt();
        account2.deposit(depositAmount2);

        // Withdraw money from account1
        System.out.print("Enter withdrawal amount for Account 1: ");
        int withdrawAmount1 = scanner.nextInt();
        try {
            account1.withdraw(withdrawAmount1);
            System.out.println("Withdrawal successful. Remaining balance in Account 1: " + account1.getBalance());
        } catch (LessBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
