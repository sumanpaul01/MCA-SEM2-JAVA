//Consider an Employee recruitment system

class TooOlder extends Exception {
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class RecruitmentSystem {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Insufficient arguments provided. Please provide candidate name and age.");
            return;
        }

        String candidateName = args[0];
        int age;

        try {
            age = Integer.parseInt(args[1]);

            if (age > 45) {
                throw new TooOlder("Candidate is too older");
            } else if (age < 20) {
                throw new TooYounger("Candidate is too younger");
            } else {
                System.out.println("Eligible");
                System.out.println("Candidate Name: " + candidateName);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid age format. Please provide a numeric value.");
        } catch (TooOlder e) {
            System.out.println("Error: " + e.getMessage());
        } catch (TooYounger e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
