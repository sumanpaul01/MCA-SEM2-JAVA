/*Implement the below Diagram. Here AbstractProduct is only abstract class*/

abstract class AbstractProduct {
    protected int product_id;
    protected String name;
    protected String description;

    public AbstractProduct(int product_id, String name, String description) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
    }
}

class Product extends AbstractProduct {
    protected double price;

    public Product(int product_id, String name, String description, double price) {
        super(product_id, name, description);
        this.price = price;
    }
}

class Book extends Product {
    public String ISBN;
    public String author;
    public String title;

    public Book(int product_id, String name, String description, double price, String ISBN, String author, String title) {
        super(product_id, name, description, price);
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }
}

class CompactDisc extends Product {
    private String artist;
    private String title;

    public CompactDisc(int product_id, String name, String description, double price, String artist, String title) {
        super(product_id, name, description, price);
        this.artist = artist;
        this.title = title;
    }
}

class TravelGuide extends Book {
    public String country;

    public TravelGuide(int product_id, String name, String description, double price, String ISBN, String author, String title, String country) {
        super(product_id, name, description, price, ISBN, author, title);
        this.country = country;
    }
}

public class Main {
    public static void main(String[] args) {
        TravelGuide travelGuide = new TravelGuide(1, "Travel Guide", "Description", 29.99, "123456789", "John Doe", "Traveling in Java", "Indonesia");
        
        System.out.println("Product ID: " + travelGuide.product_id);
        System.out.println("Name: " + travelGuide.name);
        System.out.println("Description: " + travelGuide.description);
        System.out.println("Price: $" + travelGuide.price);
        System.out.println("ISBN: " + travelGuide.ISBN);
        System.out.println("Author: " + travelGuide.author);
        System.out.println("Title: " + travelGuide.title);
        System.out.println("Country: " + travelGuide.country);
    }
}


