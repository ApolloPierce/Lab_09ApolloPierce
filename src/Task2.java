import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (i < dataPoints.length - 1) {
                System.out.print(dataPoints[i] + " | ");
            } else {
                System.out.println(dataPoints[i]);
            }
        }

        int sum = 0;
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];

            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("\nData Point Statistics:");
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        System.out.println("The minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        System.out.println("\nLinear Search:");
        int targetValue = InputHelper.getRangedInt(in, "Enter an integer between 1 and 100 to count.", 1, 100);
        int count = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == targetValue) {
                count++;
            }
        }

        System.out.println("The value " + targetValue + " was found " + count + " time(s) in the array.");

        int searchValue = InputHelper.getRangedInt(in, "Enter another integer between 1 and 100 to locate.", 1, 100);
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                System.out.println("The value " + searchValue + " was found at array index " + i + ".");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + searchValue + " was not found in the array.");
        }
    }
}
