public class Multiplication{
    public static void main(String[] args) {
        int result = multiplyThreeNumbers(10, 5, 2);
        System.out.println("The Result is: " + result);

    }

           //This method requires 3 intergers and returns 1
        public static int multiplyThreeNumbers(int valueA, int valueB,int valueC)
        {
            int product = valueA * valueB * valueC;
            return product;
        }
    }

