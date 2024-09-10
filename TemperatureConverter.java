public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius){
        return 32 + celsius * 9.0 / 5.0;
    }

    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public double convertTemperature(char scale, double temperature){

        switch(scale){
            case 'C':
                return celsiusToFahrenheit(temperature);
            case 'F':
                return fahrenheitToCelsius(temperature);
            default:
                throw new IllegalArgumentException("Invalid scala");
        }
    }

    public void display(double inputTemp, char scale, double resultTemp){
        switch(scale){
            case 'C':
                System.out.println(inputTemp + "°C = " + String.format("%.2f",resultTemp) + "°F");
                break;
            case 'F':
                System.out.println(inputTemp + "°F = " + String.format("%.2f", resultTemp) + "°C");
                break;
            default:
                throw new IllegalArgumentException("Invalid scala");

        }
    }
}
