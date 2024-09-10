public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        switch (unit.trim().toUpperCase().charAt(0)) {
            case 'C':
                return celsiusToFahrenheit(temperature);
            case 'F':
                return fahrenheitToCelsius(temperature);
            default:
                throw new IllegalArgumentException("Invalid scale: " + unit);
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
