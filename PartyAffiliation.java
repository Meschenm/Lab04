import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose your part Affiliation");
        System.out.println("D- Democrat");
        System.out.println("R - Repuiblic");
        System.out.println("I - independent");
        System.out.print("Enter your choice: ");

        String choice = input.nextLine();
        choice = choice.toUpperCase(); // Normalize input

        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Rebulican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get a Independent Man.");
        } else {
            System.out.println("You get other");
        }
    }
}





