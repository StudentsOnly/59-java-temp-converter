import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the temperature value: ");
            double temperature = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the scale ('C' for Celsius, 'F' for Fahrenheit): ");
            String scale = scanner.nextLine();

            double convertedTemperature = TemperatureConverter.convertTemperature(temperature, scale);

            if (scale.equalsIgnoreCase("C")) {
                System.out.println(temperature + "°C = " + convertedTemperature + "°F.");
            } else if (scale.equalsIgnoreCase("F")) {
                System.out.println(temperature + "°F = " + convertedTemperature + "°C.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

}
