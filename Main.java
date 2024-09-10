import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the temperature you want to convert: ");
            double temperature = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter the temperature unit: ");
            String unit = scanner.nextLine().toUpperCase().trim();
            double convertedTemp = TemperatureConverter.convertTemperature(temperature, unit);
            System.out.println("Converted temperature: " +
                    "%.2f".formatted(convertedTemp) +
                    (unit.equals("C") ? " F" : " C"));
        } catch (IllegalArgumentException | InputMismatchException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println(e);
        }
        finally {
            scanner.close();
        }

    }

}
