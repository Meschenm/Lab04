import java.util.Scanner;
public class converter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Ask for meters
        System.out.println("Enter a measurment in meter: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: inavlid input");
            return;
        }
        double meters = input.nextDouble();

        // Validate input
        if (meters <= 0) {
            System.out.println("Error: invalid input");
            return;
        }
        // Conversion
        double miles = meters / 1609.34;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;
        // Output
        System.out.printf("Miles: %.4f%n", miles);
        System.out.printf("Feet:  %.2f%n", feet);
        System.out.printf("Inches: %.2f%n", inches);
        }
    }

