public class TemperatureConverter {

    public static double convertTemperature(double temperature, String unit) {
        if (!"CF".contains(unit.toUpperCase())) {
            throw new IllegalArgumentException("Invalid scale " + unit);
        }
        return unit.equalsIgnoreCase("C") ? celsiusToFahrenheit(temperature) :
                unit.equalsIgnoreCase("F") ? fahrenheitToCelsius(temperature) : -1;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
