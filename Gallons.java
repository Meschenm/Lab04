import java.util.Scanner;
public class Gallons {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Ask for gallons
        System.out.println("Enter number of gallons in tank: ");
        if (!input.hasNextDouble()) {
            System.out.println("Error: Invalid input for gallons");
            return;
        }
        double gallons = input.nextDouble();

        //Ask for fuel efficiency
        System.out.println("Enter number for fuel efficiency(miles per gallon) : ");
        if (!input.hasNextDouble()) {
            System.out.println("Error invalid input for fuel efficiency");
            return;
        }
        double mpg = input.nextDouble();

        // Ask for Price of gas per gallon
        System.out.println("Enter Price of gas per gallon: ");
        if (!input.hasNextDouble()){
            System.out.println("Error invalid input for Price of gas per gallon");
            return;
    }
        double pricePerGallon = input.nextDouble();

        // Make sure all values are postive

        if (gallons <= 0 || mpg <= 0 || pricePerGallon <= 0) {
            System.out.println("Error all values must be greater than 0");
            return;
        }
        //Calculations
        double costPer100Miles = (100/mpg) * pricePerGallon;
        double maxDistance = gallons * mpg;

        //output
        System.out.println("The cost for 100 miles would be: " + costPer100Miles);
        System.out.println("Maxium distance with current gas: " + maxDistance);



        }



    }

