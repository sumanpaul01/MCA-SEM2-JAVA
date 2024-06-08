/*Create an abstract class Accounts with the following details:
Data Members:
(a) Balance (b) accountNumber (c) accountHoldersName (d) address
Methods:
(a) withdrawl()- abstract
(b) deposit()- abstract 
(c) display() to show the balance of the account number
Create a subclass of this class SavingsAccount and add the following details:
Data Members:
(a) rateOfInterest
Methods:
(a) calculateAount()*/

abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHolderName;
    protected String address;

    public Accounts(double balance, int accountNumber, String accountHolderName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
    }

    public abstract void withdrawal(double amount);

    public abstract void deposit(double amount);

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(double balance, int accountNumber, String accountHolderName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHolderName, address);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void withdrawal(double amount) {
        balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    public void calculateAmount() {
        // Implement your logic for calculating amount here
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 123456, "John Doe", "123 Main St", 0.05);
        
        // Displaying initial account details
        System.out.println("Initial Account Details:");
        savingsAccount.display();
        
        // Performing deposit and withdrawal
        savingsAccount.deposit(500.0);
        savingsAccount.withdrawal(200.0);
        
        // Displaying updated account details
        System.out.println("\nUpdated Account Details:");
        savingsAccount.display();
    }
}
