/*Implement the following diagram*/

interface Exam {
    double percent_cal(double marks1, double marks2);
}

class Student implements Exam {
    String name;
    int roll_no;
    double marks1;
    double marks2;

    public Student(String name, int roll_no, double marks1, double marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public double percent_cal(double marks1, double marks2) {
        // Calculate the percentage
        return ((marks1 + marks2) / 200) * 100;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

class Result {
    double per;

    public Result(double per) {
        this.per = per;
    }

    public void display() {
        System.out.println("Percentage: " + per);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 101, 85, 90);
        double percentage = student1.percent_cal(student1.marks1, student1.marks2);
        Result result1 = new Result(percentage);

        student1.show();
        result1.display();
    }
}
