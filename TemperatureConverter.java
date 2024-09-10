class InvalidScaleException extends IllegalArgumentException { // Custom exception
    public InvalidScaleException(String message) {
        super(message);
    }
}

class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

       public static double convertTemperature(double temperature, String scale) throws InvalidScaleException {
        if (scale.equalsIgnoreCase("C")) {
                return celsiusToFahrenheit(temperature);
        } else if (scale.equalsIgnoreCase("F")) {
               return fahrenheitToCelsius(temperature);
        } else {
                throw new InvalidScaleException("Invalid scale: " + scale);
        }
    }
}