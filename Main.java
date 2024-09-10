import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                try {
                     System.out.print("Enter the temperature value (or type 'exit' to quit): ");
                    String input = scanner.nextLine();

                    if (input.equalsIgnoreCase("exit")) {
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    }

                    double temperature = Double.parseDouble(input);

                    System.out.print("Enter the scale (C for Celsius or F for Fahrenheit): ");
                    String scale = scanner.nextLine();

                    double convertedTemperature = TemperatureConverter.convertTemperature(temperature, scale);

                    if (scale.equalsIgnoreCase("C")) {
                        System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                    } else if (scale.equalsIgnoreCase("F")) {
                        System.out.println("Temperature in Celsius: " + convertedTemperature);
                    }

                } catch (InvalidScaleException e) {
                    // Handle custom invalid scale exception
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid temperature value. Please enter a valid number.");
                }
            }
        } finally {
            // Ensure the scanner is closed
            System.out.println("Closing scanner");
            scanner.close();
        }
    }
}
