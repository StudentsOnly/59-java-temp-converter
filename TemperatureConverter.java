import java.util.IllegalFormatException;

public class TemperatureConverter {

    private double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    private double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public String convertTemperature(String input) throws IllegalArgumentException {
        validateInput(input);

        char c = input.charAt(input.length() - 1);
        String temperature = input.substring(0, input.length() - 1);
        double temp = Double.parseDouble(temperature);
        Double convertedTemp = null;
        switch (c) {
            case 'C': {
                checkCelsius(temp);
                convertedTemp = celsiusToFahrenheit(temp);
                c = 'F';
                break;
            }
            case 'F': {
                checkFahrenheit(temp);
                convertedTemp = fahrenheitToCelsius(temp);
                c = 'C';
                break;
            }
        }
        return convertedTemp + " " + c;

    }

    private void validateInput(String input) throws IllegalFormatException {
        if (!input.matches("-?[0-9]+(.[0-9]+)?[FC]")) throw new IllegalArgumentException("Wrong temperature format");
    }

    private void checkCelsius(double temperature) throws IllegalArgumentException {
        if (temperature < -273.15) throw new IllegalArgumentException("Temperature can't be less that -273.15 C");
    }

    private void checkFahrenheit(double temperature) throws IllegalArgumentException {
        if (temperature < -459.67) throw new IllegalArgumentException("Temperature can't be less that -273.15 F");
    }

}
