import java.util.Scanner;
public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Ask for length
        System.out.println("Enter the length of the rectangle: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: you entered a invalid input");
            return;
        }
        double length = input.nextDouble();
        // Ask for width
        System.out.println("Enter the width of the rectangle");
        if (!input.hasNextDouble()) {
            System.out.println("Error: you entered a invalid input");
            return;
        }
        double width = input.nextDouble();

        // Validation
        if (length <= 0 || width <= 0)
        {
            System.out.println("Error: the values must be greater than zero");
            return;
        }
            // Calculations
            double area = length * width;
            double permiter = 2 * (length + width);
            double diagonal = (length * length) + (width * width);
            // Output
            System.out.println("Area: " + area);
            System.out.println("permiter: " + permiter);
            System.out.println("diagonal: " + diagonal);
    }
    }

