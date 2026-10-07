import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius");
        // Check if user entered a input
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid Input, Please enter numerical input");
            return; // Stop program
        }
        double celsius = input.nextDouble();
        // Convert C to F
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Temperature in fahrenheit: " + fahrenheit);
        }


    }

