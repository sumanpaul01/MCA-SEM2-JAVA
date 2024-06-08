/*Implement the below Diagram.
Here, Asset class is an abstract class containing an abstract method displayDetails() 
method. Stock, bond and Savings class inherit the Asset class and displayDetails() 
method is defined in every class.*/

import java.util.Date;

abstract class Asset {
    protected String descriptor;
    protected Date date;
    protected double currentValue;

    public Asset(String descriptor, Date date, double currentValue) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
    }

    public abstract void displayDetails();
}

class Stock extends Asset {
    private int numShares;
    private double sharePrice;

    public Stock(String descriptor, Date date, double currentValue, int numShares, double sharePrice) {
        super(descriptor, date, currentValue);
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    @Override
    public void displayDetails() {
        System.out.println("Stock Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Number of Shares: " + numShares);
        System.out.println("Share Price: " + sharePrice);
    }
}

class Bond extends Asset {
    private double interestRate;

    public Bond(String descriptor, Date date, double currentValue, double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bond Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}

class Savings extends Asset {
    private double interestRate;

    public Savings(String descriptor, Date date, double currentValue, double interestRate) {
        super(descriptor, date, currentValue);
        this.interestRate = interestRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Savings Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("Tech Stock", new Date(), 2000.0, 100, 50.0);
        Bond bond = new Bond("Government Bond", new Date(), 3000.0, 0.05);
        Savings savings = new Savings("High Yield Savings", new Date(), 5000.0, 0.03);

        stock.displayDetails();
        System.out.println();
        bond.displayDetails();
        System.out.println();
        savings.displayDetails();
    }
}
