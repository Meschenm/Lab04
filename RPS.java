import java.util.Locale;
import java.util.Scanner;
public class RPS {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Player A input
        System.out.print("Player A, enter your move (R, P, S): ");
        String a = in.nextLine().trim().toUpperCase();

        if (!a.equals("R") && !a.equals("P") && !a.equals("S")) {
            System.out.println("Error: Player A must enter R, P, S");
            System.exit(0);
        }
        // Player B input
        System.out.print("Player B enter your move (R, P, S): ");
        String b = in.nextLine().trim().toUpperCase();

        if (!b.equals("R") && !b.equals("P") && !b.equals("S")) {
            System.out.println("Error: Player B must enter (R, P, S)");
            System.exit(0);
        }
        // Outcome
        if (a.equals(b)) {
            System.out.println(moveName(a) + " Vs " + moveName(b) + " It's a Tie!");
        } else if (a.equals("R") && b.equals("S")) {
            System.out.println("Rock beats Paper - Player A wins!");
        } else if (a.equals("P") && b.equals("R")) {
            System.out.println("Paper beats Rock - Player A wins!");
        } else if (a.equals("S") && b.equals("P")) {
            System.out.println("Scissors beats Paper - Player A wins!");
        } else {
            // Player B wins
            if (b.equals("R") && a.equals("S")) {
                System.out.println("Rock beats Paper - Player B wins!");
            } else if (b.equals("P") && a.equals("R")) {
                System.out.println("Paper beats Scissors - Player B wins!");
            } else if (b.equals("S") && a.equals("P")) {
                System.out.println("Scissprs beats Paper - Player B wins");
            }
        }
    }

    // Helper to print full names
    public static String moveName(String m) {
        switch (m) {
            case "R": return "Rock";
            case "P": return "Paper";
            case "S": return "Scissors";
        }
        return "";
    }
}
