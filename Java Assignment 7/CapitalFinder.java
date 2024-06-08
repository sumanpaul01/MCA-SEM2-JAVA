//Write a program that outputs the name of the capital of the country entered at the command line.....

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {
    private static Map<String, String> capitals;

    static {
        capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("UK", "London");
        capitals.put("France", "Paris");
        // Add more country-capital mappings as needed
    }

    public static String findCapital(String country) throws NoMatchFoundException {
        String capital = capitals.get(country);
        if (capital == null) {
            throw new NoMatchFoundException("No capital found for the country: " + country);
        }
        return capital;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine();
        scanner.close();

        try {
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
