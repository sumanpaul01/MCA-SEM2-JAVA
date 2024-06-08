/*Write a program to implement the Multiple Inheritance (Bank Interface, Customer & 
Account classes).
*/

// Interface for Bank
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

// Interface for Customer
interface Customer {
    void displayDetails();
}

// Account class implementing Bank interface
class Account implements Bank {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Customer class implementing Customer interface
class CustomerImpl extends Account implements Customer {
    private String name;
    private int id;

    public CustomerImpl(String name, int id, double balance) {
        super(balance);
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Account Balance: $" + getBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a new customer account
        CustomerImpl customer = new CustomerImpl("John Doe", 1001, 1000);

        // Depositing and withdrawing from the account
        customer.deposit(500);
        customer.withdraw(200);

        // Displaying customer details
        customer.displayDetails();
    }
}
