/*Program to implement the Multiple Inheritance (Exam Interface, Student & Result 
classes).
*/

// Interface for Exam
interface Exam {
    void conductExam();
}

// Interface for Student
interface Student {
    void study();
}

// Interface for Result
interface Result {
    void displayResult();
}

// Class implementing Exam interface
class ExamImpl implements Exam {
    @Override
    public void conductExam() {
        System.out.println("Exam is being conducted.");
    }
}

// Class implementing Student interface
class StudentImpl implements Student {
    @Override
    public void study() {
        System.out.println("Student is studying.");
    }
}

// Class implementing Result interface
class ResultImpl implements Result {
    @Override
    public void displayResult() {
        System.out.println("Result is being displayed.");
    }
}

// Combined class implementing multiple interfaces
class Combined implements Exam, Student, Result {
    private Exam exam = new ExamImpl();
    private Student student = new StudentImpl();
    private Result result = new ResultImpl();

    @Override
    public void conductExam() {
        exam.conductExam();
    }

    @Override
    public void study() {
        student.study();
    }

    @Override
    public void displayResult() {
        result.displayResult();
    }
}

public class Main {
    public static void main(String[] args) {
        Combined combined = new Combined();
        combined.study();
        combined.conductExam();
        combined.displayResult();
    }
}
