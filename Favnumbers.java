import java.util.Scanner;
public class Favnumbers {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt;
        double favDouble;

        favInt = SafeInput.getInt(in, "Enter your favorite integar");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");

        System.out.println("\n Your favorite integar is: " + favInt);
        System.out.println("\n Your favorite double is: " + favDouble);
    }
}