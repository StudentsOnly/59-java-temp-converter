import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TemperatureConverter converter = new TemperatureConverter();
        while (true) {
            System.out.println("Enter temperature in format 36C or 55.67F");
            String input = s.nextLine();
            try {
                String output = converter.convertTemperature(input);
                System.out.println(output);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
