//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Starting balance
         double balance = 5000.00;
        // Monthly interest rate (17%)
         double interestRate = 0.17;
        // Month 1 interest
         double month1interest = balance * interestRate;
         balance = balance + month1interest;
        // Month 2 interest
         double month2interest = balance * interestRate;
         balance = balance + month2interest;
         // Output
          System.out.println("Interest due after Month 1: $" + month1interest);
          System.out.println("Balance after Month 1: $" + (5000 + month1interest));
          System.out.println("\nInterest due after Month 2: $" + month2interest);
          System.out.println("Balance after Month 2: $" + balance);
    }
}
