//TemperatureChecker

class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}

class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}

public class TemperatureChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No temperature provided.");
            return;
        }

        try {
            double temperature = Double.parseDouble(args[0]);

            if (temperature > 35) {
                throw new TooHot("Temperature is too hot");
            } else if (temperature < 5) {
                throw new TooCold("Temperature is too cold");
            } else {
                System.out.println("Normal");
                double fahrenheit = (temperature * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid temperature format. Please provide a numeric value.");
        } catch (TooHot e) {
            System.out.println("Error: " + e.getMessage());
        } catch (TooCold e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
