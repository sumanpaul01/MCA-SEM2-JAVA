/*Write a program to define a class Item containing code and price. Accept this data for five objects using array of objects. Display code, price in tabular form and also, display total price of all items. */
import java.util.Scanner;
class Item {
    private int code;
    private double price;
    // Constructor
    public Item(int code, double price) {
        this.code = code;
        this.price = price;
    }
    // Getter methods
    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create an array of Item objects to store data for five items
        Item[] items = new Item[5];
        // Accept data for five items
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter code for item " + (i + 1) + ": ");
            int code = scanner.nextInt();
            System.out.print("Enter price for item " + (i + 1) + ": ");
            double price = scanner.nextDouble();
            // Create Item object and store it in the array
            items[i] = new Item(code, price);
        }
        // Display code and price in tabular form
        System.out.println("\nCode\tPrice");
        System.out.println("--------------");
        double totalPrice = 0;
        for (Item item : items) {
            System.out.println(item.getCode() + "\t" + item.getPrice());
            totalPrice += item.getPrice();
        }
        // Display total price of all items
        System.out.println("\nTotal Price of all items: " + totalPrice);
        scanner.close();
    }
}