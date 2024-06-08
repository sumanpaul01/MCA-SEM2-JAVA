/*Create a class called Complex, which has three private instance variables –real and imaginary. It contains a method called add( ) which takes one Complex object as parameter and print the added value of the calling Complex object and passes Complex object. In the main method, declare two Complex objects and assign values using constructor and call the add() method. */
import java.util.*;
class Complex {
    private double real;
    private double imaginary;
    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // Method to add two Complex numbers
    public void add(Complex c) {
        double newReal = this.real + c.real;
        double newImaginary = this.imaginary + c.imaginary;
        System.out.println("Added Complex Number: " + newReal + " + " + newImaginary + "i");
    }
}
public class Main {
    public static void main(String[] args) {
        // Create two Complex objects
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real & imaginary part of number 1");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex complex1 = new Complex(r1,i1);
        System.out.println("Enter the real & imaginary part of number 2");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex complex2 = new Complex(r2,i2);
        // Add the two Complex objects
        complex1.add(complex2);
    }
}