import java.util.Scanner;
public class ShippingCost {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask user for price
        System.out.print("Enter price of item: ");
        double price = input.nextDouble();

        double shippingCost;

        if (price >=100) {
            shippingCost = 0;
        } else {
            shippingCost = price * .02;
        }
        double totalPrice = price + shippingCost;
        System.out.println("shippingCost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);

        }
        }
