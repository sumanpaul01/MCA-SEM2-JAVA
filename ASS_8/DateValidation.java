import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (in format dd-MM-yyyy):");
        String dateStr = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(dateStr);
            System.out.println("Date is in proper format.");
        } catch (ParseException e) {
            System.out.println("Date is not in proper format.");
        }
    }
}
