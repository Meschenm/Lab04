
public class Counting {
    public static void main(String[] args) {

        // 1. count up by 1 from 0 to 20
        System.out.println("1. Count up from 0 to 20");
        int count1 = 0;
        while (count1 <= 20) {
            System.out.println(count1);
            count1++;
        }


        // 2. count down by 1 from 20 to 0
        System.out.println("\n2. Count down by 1 from 20 to 0");
        int count2 = 20;
        while (count2 >= 0) {
            System.out.println(count2);
            count2--;
        }

        // 3. count up by 3 from 0 to 24
        System.out.println("\n3. count up by 3 from 0 to 24");
        int count3 = 0;
        while (count3 <= 24) {
            System.out.println(count3);
            count3 += 3;
        }
        // 4. Count down by 2 from 12 to 0
        System.out.println("\n4. count down by 2 from 12 to 0");
        int count4 = 12;
        while (count4 >= 0) {
            System.out.println(count4);
            count4 -= 2;
        }
        // 5. Triangle Increasing
        System.out.println("\n5. Increasing Triangle");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6. Triangle Decreasing
        System.out.println("\n6. Decreasing Triangle");

        for (int row = 6; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7. Rectangle
        System.out.println("\n7. Rectangle");
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

