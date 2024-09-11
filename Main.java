import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // !!! *try-with-resources block* => automatically close the Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            double temperature = validateTemperatureInput(scanner);

            String scale = validateScaleInput(scanner);

            double convertedTemperature = TemperatureConverter.convertTemperature(temperature, scale);

            if (scale.equalsIgnoreCase("C")) {
                System.out.println(temperature + "°C = " + convertedTemperature + "°F.");
            } else if (scale.equalsIgnoreCase("F")) {
                System.out.println(temperature + "°F = " + convertedTemperature + "°C.");
            }

        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values for the temperature.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    private static double validateTemperatureInput(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Enter the temperature value: ");
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid temperature input. Please enter a valid numeric value.");
            }
        }
    }

    private static String validateScaleInput(Scanner scanner) {
        while (true) {
            System.out.print("Enter the scale ('C' for Celsius, 'F' for Fahrenheit): ");
            String scale = scanner.nextLine().trim();
            if (!scale.isEmpty() && (scale.equalsIgnoreCase("C") || scale.equalsIgnoreCase("F"))) {
                return scale;
            } else {
                System.out.println("Invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            }
        }
    }
}