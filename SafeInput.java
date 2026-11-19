

import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;
    }

// Gets valid integar from user

    public static int getInt(Scanner pipe, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                return value;
            } else {

                pipe.nextLine(); //clear bad input
                System.out.println("Invalid integer.");
            }
        }
    }


    // Gets valid double value
    public static double getDouble(Scanner pipe, String prompt) {
        while (true) {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                double value = pipe.nextDouble();
                pipe.nextLine();
                return value;
            }
            pipe.nextLine();
            System.out.print("You must enter a valid double integar.");
        }

    }

    // Get integar within range
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value;
        boolean done = false;
        do {
            System.out.print(prompt + "[" + low + "-" + high + "]: ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Error: Please enter a integar in the range" + low + "and" + high + ".");
                }
            } else {
                String trash = pipe.nextLine(); // Read and discard bad input
                System.out.println("Error: '" + trash + "' is not valid integar");
            }
        } while (!done);
        return 0; //never reached
    }


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value;

        while (true) {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();

                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Value must be between " + low + " and " + high);
                }
            } else {
                pipe.nextLine(); //clear trash
                System.out.println("invalid double.");
            }
        }

    }


    // Get y, Y, yes ,Yes,YES or n,N,no,No,No as a valid answer
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        boolean result = false;
        boolean done = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if (response.equalsIgnoreCase("Y") ||
                    response.equalsIgnoreCase("Yes")) {
                result = true;
                done = true;
            } else if (response.equalsIgnoreCase("N") ||
                    response.equalsIgnoreCase("No")) {
                result = false;
                done = true;

            } else {
                System.out.println("Invalid input. Please enter Y, N, Yes, or No");
            }
        } while (!done);
        return result;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String value;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNext(regEx)) {
                value = pipe.next();
                pipe.nextLine(); // clear buffer
                return value;
            } else {
                System.out.println("invalid input.");
                pipe.nextLine(); // clear trash
            }
        } while (true);
    }
}







