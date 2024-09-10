import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner scan = new Scanner(System.in);
        validator(converter, scan);
    }

    public static char scalaValidator(TemperatureConverter converter, Scanner scan) {
        boolean valid = false;
        char scala = ' ';
        while (!valid) {
            System.out.println("Enter scala:");
            try {
                scala = scan.nextLine().toUpperCase().charAt(0);
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Enter 'c' - for Celsius, 'f' - for Fahrenheit");
              //  valid = false;
            }
        }
        return scala;
    }

    public static double temperatureValidator(TemperatureConverter converter, Scanner scan){
        boolean valid = false;
        double temp = 0;
        while (!valid) {
            System.out.println("Enter temperature:");
            try {
                temp = Double.valueOf(scan.nextLine());
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Temperature should be 'double'");
              //  valid = false;
            }
        }
        return temp;
    }

    public static double validator(TemperatureConverter converter, Scanner scan){
        char scala = ' ';
        double temp = temperatureValidator(converter, scan);
        double result = 0;
        boolean valid = false;

        while (!valid) {
            try {
                result = converter.convertTemperature(scala, temp);
                valid = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Enter 'c' - for Celsius, 'f' - for Fahrenheit");
                scala = scalaValidator(converter, scan);
            }
        }
        converter.display(temp, scala, result);
        return result;
    }

}
