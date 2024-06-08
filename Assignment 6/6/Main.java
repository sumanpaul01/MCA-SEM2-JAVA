/*Create an interface Department containing attributes deptName and deptHead. It also 
has abstract methods for printing the attributes. Create a class hostel containing 
hostelName, hostelLocation and numberofRooms. The class contains methods for 
getting and printing the attributes. Then write Student class extending the Hostel class 
and implementing the Department interface. This class contains attributes studentName, 
regdNo, electiveSubject and avgMarks. Write suitable getData and printData methods 
for this class. Also implement the abstract methods of the Department interface. Write a 
driver class to test the Student class. The program should be menu driven containing the 
options:
i) Admit new student
ii) Migrate a student
iii) Display details of a student
For the third option a search is to be made on the basis of the entered registration 
number.*/

import java.util.Scanner;

// Interface Department
interface Department {
    void printAttributes();
}

// Class Hostel
class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    // Constructor
    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    // Method to print attributes
    public void printAttributes() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

// Class Student implementing Department interface and extending Hostel class
class Student extends Hostel implements Department {
    private String studentName;
    private int regdNo;
    private String electiveSubject;
    private double avgMarks;

    // Constructor
    public Student(String hostelName, String hostelLocation, int numberOfRooms, String studentName,
                   int regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    // Method to print data
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printAttributes();
    }

    // Method to get data
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter Elective Subject: ");
        electiveSubject = scanner.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = scanner.nextDouble();
        System.out.print("Enter Hostel Name: ");
        hostelName = scanner.next();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = scanner.next();
        System.out.print("Enter Number of Rooms: ");
        numberOfRooms = scanner.nextInt();
    }
}

// Driver Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student details:");
                    student = new Student("", "", 0, "", 0, "", 0);
                    student.getData();
                    break;
                case 2:
                    if (student != null) {
                        System.out.println("Enter new hostel details:");
                        student.getData();
                    } else {
                        System.out.println("No student admitted yet!");
                    }
                    break;
                case 3:
                    if (student != null) {
                        student.printData();
                    } else {
                        System.out.println("No student admitted yet!");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
        scanner.close();
    }
}


