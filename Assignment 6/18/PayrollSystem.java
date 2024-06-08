/*Java program to Perform Payroll Using Interface (Multiple Inheritance).*/

// Interface for an employee
interface Employee {
    double calculateSalary();
}

// Interface for a tax payer
interface TaxPayer {
    double calculateTax();
}

// Class representing a full-time employee
class FullTimeEmployee implements Employee, TaxPayer {
    private String name;
    private double salary;
    private double taxRate;

    public FullTimeEmployee(String name, double salary, double taxRate) {
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public double calculateTax() {
        return salary * taxRate;
    }

    public String getName() {
        return name;
    }
}

// Class representing a contractor
class Contractor implements Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public String getName() {
        return name;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        FullTimeEmployee employee1 = new FullTimeEmployee("John Doe", 50000, 0.2);
        Contractor contractor1 = new Contractor("Jane Smith", 30, 40);

        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Salary: $" + employee1.calculateSalary());
        System.out.println("Tax: $" + employee1.calculateTax());
        System.out.println();

        System.out.println("Contractor Name: " + contractor1.getName());
        System.out.println("Salary: $" + contractor1.calculateSalary());
    }
}
