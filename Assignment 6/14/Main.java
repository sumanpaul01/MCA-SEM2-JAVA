/*Write a java program to implement the Multiple Inheritance (Gross Interface, Employee & 
Salary classes).*/

// Interface defining gross income
interface Gross {
    double calculateGross();
}

// Interface defining employee details
interface Employee {
    String getName();
    int getId();
}

// Interface defining salary details
interface Salary {
    double getSalary();
}

// Concrete class implementing Employee details
class EmployeeImpl implements Employee {
    private String name;
    private int id;

    public EmployeeImpl(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }
}

// Concrete class implementing Salary details
class SalaryImpl implements Salary {
    private double salary;

    public SalaryImpl(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

// Concrete class implementing Gross income
class GrossImpl implements Gross {
    private Employee employee;
    private Salary salary;

    public GrossImpl(Employee employee, Salary salary) {
        this.employee = employee;
        this.salary = salary;
    }

    @Override
    public double calculateGross() {
        return salary.getSalary() * 12; // For simplicity, assuming yearly salary
    }

    public void displayDetails() {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: " + salary.getSalary());
        System.out.println("Gross Income: " + calculateGross());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create employee and salary objects
        Employee employee = new EmployeeImpl("John Doe", 1001);
        Salary salary = new SalaryImpl(50000);

        // Create Gross object
        Gross gross = new GrossImpl(employee, salary);

        // Display details including gross income
        ((GrossImpl) gross).displayDetails();
    }
}
