import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int month = input.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Your birth is: " + month);
        } else {
            System.out.println("You entered a incorrected month value: " + month);
        }
    }
}