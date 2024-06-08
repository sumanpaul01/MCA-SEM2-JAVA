/*Write a program to define a class Student with four data members such as name, roll no., sub1, and sub2. Define appropriate methods to initialize and display the values of data members. Also calculate total marks and percentage scored by student. */
import java.util.*;
class Student {
    private String name;
    private int rollNo;
    private int sub1;
    private int sub2;
    // Constructor
    public Student(String name, int rollNo, int sub1, int sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
    // Method to calculate total marks
    public int calculateTotalMarks() {
        return sub1 + sub2;
    }
    // Method to calculate percentage
    public double calculatePercentage() {
        int totalMarks = calculateTotalMarks();
        return (double) totalMarks / 2; // Assuming each subject is out of 100
    }
}
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name,roll,subject 1 marks & subject 2 marks respectively");
        String name = sc.nextLine();
        int roll = sc.nextInt();
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        Student student = new Student(name,roll,sub1,sub2);
        // Display student details
        student.displayDetails();
        // Calculate and display total marks
        int totalMarks = student.calculateTotalMarks();
        System.out.println("Total Marks: " + totalMarks);
        // Calculate and display percentage
        double percentage = student.calculatePercentage();
        System.out.println("Percentage: " + percentage + "%");
    }
}