/*Write a program to define a class Tender containing data members cost and company name. Accept data for five objects and display company name for which cost is minimum. */
import java.util.Scanner;
class Tender {
    private double cost;
    private String companyName;
    // Constructor
    public Tender(double cost, String companyName) {
        this.cost = cost;
        this.companyName = companyName;
    }

    // Getter methods
    public double getCost() {
        return cost;
    }

    public String getCompanyName() {
        return companyName;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array of Tender objects to store data for five tenders
        Tender[] tenders = new Tender[5];
        // Accept data for five tenders
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter cost for tender " + (i + 1) + ": ");
            double cost = scanner.nextDouble();
            System.out.print("Enter company name for tender " + (i + 1) + ": ");
            scanner.nextLine(); // Consume newline
            String companyName = scanner.nextLine();
            // Create Tender object and store it in the array
            tenders[i] = new Tender(cost, companyName);
        }
        // Find the company with minimum cost
        String minCompanyName = tenders[0].getCompanyName();
        double minCost = tenders[0].getCost();
        for (int i = 1; i < 5; i++) {
            if (tenders[i].getCost() < minCost) {
                minCost = tenders[i].getCost();
                minCompanyName = tenders[i].getCompanyName();
            }
        }
        // Display the company name with minimum cost
        System.out.println("\nCompany with Minimum Cost:");
        System.out.println("Company Name: " + minCompanyName);
        System.out.println("Cost: " + minCost);
    }
}