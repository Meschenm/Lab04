import java.util.Scanner;
public class Reggie{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String ssn;
        String mNumber;
        String zip4;

        ssn = SafeInput.getRegExString(in, "Enter SSN",
                "\\d{3}-\\d{2}-\\d{4}");
        mNumber = SafeInput.getRegExString(in,"Enter UC M Number",
                "(M|m)\\d{5}");
        zip4 = SafeInput.getRegExString(in, "Enter Zip+4",
                "\\d{5}-\\d{4}");

        System.out.println("\nSSN: " + ssn);
        System.out.println("M Number: " + mNumber);
        System.out.println("Zip+4: " + zip4);

    }
    }
