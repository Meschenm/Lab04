import java.util.Scanner;
public class BirthDateTime {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year, month, day, hours, minutes;
        int maxDay;

        year = SafeInput.getRangedInt(in, "Enter year", 1921, 2020);
        month = SafeInput.getRangedInt(in, "Enter month", 1, 12);

        switch (month) {
            case 2:
                maxDay = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;

            default:
            maxDay = 31;
            break;
        }
        day = SafeInput.getRangedInt(in, "Enter day", 1, maxDay);
        hours = SafeInput.getRangedInt(in, "Enter hour", 1, 24);
        minutes = SafeInput.getRangedInt(in, "Enter mintue", 1, 59);

        System.out.println("\n Birth Date and Time");
        System.out.println(month + "/" + day +  "/" + year + " " + hours + ":" + minutes);
    }
}