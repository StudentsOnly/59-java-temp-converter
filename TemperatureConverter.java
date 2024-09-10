public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertTemperature(double temperature, String scale) {
        if (scale.equalsIgnoreCase("C")) {
            return celsiusToFahrenheit(temperature);
        } else if (scale.equalsIgnoreCase("F")) {
            return fahrenheitToCelsius(temperature);
        } else {
            throw new IllegalArgumentException("Invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
        }
    }
}
