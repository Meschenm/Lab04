import java.util.Random;
public class ArrayTesting {
    public static void main(String[] args) {
        Random rnd = new Random();

        int[] dataPoints = new int[50];

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(50) + 1;
        }
        for(int i = 0; i < dataPoints.length; i++){
            System.out.print(dataPoints[i]);

            if(i < dataPoints.length - 1)
            {
                System.out.print(" | ");
            }
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < dataPoints.length; i ++){
            sum += dataPoints[i];
        }
        // calculate average
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);


    }
}