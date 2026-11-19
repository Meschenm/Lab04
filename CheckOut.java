import java.util.Scanner;

public class CheckOut{

public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    double price;
    double total = 0.0;
    boolean moreItems;

    do {
        price = SafeInput.getRangedDouble(in, "Enter item price", 0.50, 99.99);
        total += price;
        moreItems = SafeInput.getYNConfirm(in, "Do you have another Item");
    }
    while(moreItems);
    System.out.printf("\nTotal Cost: $%.2f\n", total);
    }
}
    
