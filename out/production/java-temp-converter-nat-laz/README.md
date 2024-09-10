## Exercise: Handling IllegalArgumentException in a Temperature Converter

#### Description:

- Create a Java program that converts temperatures between Celsius and Fahrenheit.
- The program allows users to specify the input temperature and its scale, but there is a potential issue related to invalid temperature scales and IllegalArgumentException that needs to be addressed.

- Your task is to implement the program by following the provided instructions, including creating classes, methods, and handling potential IllegalArgumentExceptions gracefully.

#### Instructions:

1.	Create a Java class named TemperatureConverter to perform temperature conversions.
2.	This class should include the following methods:
    -	celsiusToFahrenheit: Converts a temperature from Celsius to Fahrenheit and returns the result.
    -	fahrenheitToCelsius: Converts a temperature from Fahrenheit to Celsius and returns the result.
    -	convertTemperature: Converts a temperature based on the specified scale ("C" for Celsius or "F" for Fahrenheit) and returns the result.
    -	Handle potential IllegalArgumentException gracefully by returning "Invalid scale" if an invalid scale is provided.
3.	Allow users to enter a temperature value and its scale and display the converted temperature.
4.	Ensure that the program handles IllegalArgumentException gracefully when the user enters an invalid temperature.
